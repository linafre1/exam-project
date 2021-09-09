package com.example.demo.business;

import com.example.demo.*;
import com.example.demo.database.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class MainService {

    @Autowired
    ActivityRepository activityRepository;
    @Autowired
    TypeRepository typeRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ChallengeRepository challengeRepository;

    public List<Activity> getActivityList(User user) {
        List<Activity> activities = activityRepository.findByUserId(user.getId());
        Collections.sort(activities,new ActivityComparator());
        return activities;
    }

    public Activity getActivity (Long activityId) {
        return activityRepository.findById(activityId).get();
    }

    //Hämta en lista utifrån vilka vänner Usern har.
    public List<Activity> getActivityListWithFriends(User user) {
        List<Activity> activities = new ArrayList<>();
        if (user == null) {
            return activities;
        }
        Map<Long, User> friends = user.getFriends();
        for (Long friendId: friends.keySet()) {
            activities.addAll(activityRepository.findByUserId(friendId));
        }
        Collections.sort(activities,new ActivityComparator());
        return activities;
    }

    public void saveActivity(Activity activity, Long typeId) {
        Type activityType = typeRepository.findById(typeId).get();
        Integer points = (int)(activityType.getPoints() * activity.getDistance());
        activity.setType(activityType);
        activity.setPoints(points);
        activityRepository.save(activity);

    }

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public List<User> getAllUsersWithoutFriends (User user) {
        List<User> noFriends = new ArrayList<>();
        for (User u : getAllUsers()) {
            if (user.getFriends().containsKey(u.getId()) || user.getId().equals(u.getId())) {
                continue;
            } else {
                noFriends.add(u);
            }
        }
        return noFriends;
    }

    public User logIn(String username, String password) {
        User user = userRepository.findByAlias(username);
        if(user != null && user.getPassword().equals(password)){
            return user;
        } else {
            return null;
        }
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<Type> getTypes() {
        return (List<Type>) typeRepository.findAll();
    }

    public void saveFriend(User user, Long senderId, boolean accept) {
        User sender = userRepository.findById(senderId).get();
        if (user.getFriends().containsKey(senderId) || !accept) {
            return;
        }
        user.getFriends().put(sender.getId(), sender);
        sender.getFriends().put(user.getId(), user);
        user.getFriendRequests().remove(sender.getId());
        userRepository.save(user);
        userRepository.save(sender);
    }

    public void saveFriendRequest(User user, Long friendRequest) {
        User friend = userRepository.findById(friendRequest).get();
        if (friend.getFriendRequests().containsKey(user.getId()) ||
                user.getFriendRequests().containsKey(friend.getId()) ||
                user.getFriends().containsKey(friend.getId()) ||
                user.getId().equals(friendRequest)) {
            return;
        }
        friend.getFriendRequests().put(user.getId(), user);
        userRepository.save(friend);
    }

    public Challenge getChallenge(Long challengeId) {
        return challengeRepository.findById(challengeId).get();
    }

    public void saveChallenge(Challenge challenge) {
        challengeRepository.save(challenge);
    }

    public List<Challenge> getAllChallenges() {
        return challengeRepository.findAllByOrderByNameAsc();
    }

    public Summary getSummarybyId(Long id) {
        List<Activity> activities = activityRepository.findByUserId(id);
        return getSummary(activities);
    }

    public Summary getSummary(List<Activity> userActivities) {
        Summary summary = new Summary();
        int numofAct = userActivities.size();
        summary.setActivity(numofAct);

        float totalDistance = 0;
        for (int i = 0; i < userActivities.size(); i++) {

            totalDistance += userActivities.get(i).getDistance();

        }
        summary.setDistance(totalDistance);

        Duration totalDuration = new Duration();
        int seconds = 0; int minutes = 0; int hours = 0;
        int restSeconds; int restMinutes;
        for (int i = 0; i < userActivities.size(); i++) {

            seconds += userActivities.get(i).getDuration().getSeconds();
            minutes += userActivities.get(i).getDuration().getMinutes();
            hours += userActivities.get(i).getDuration().getHours();

            if (seconds > 59) {
                restSeconds = seconds % 60;
                minutes += 1;
                seconds = restSeconds;
            }

            if (minutes > 59) {
                restMinutes = minutes % 60;
                hours += 1;
                minutes = restMinutes;

            }
        }
        totalDuration.setHours(hours);
        totalDuration.setMinutes(minutes);
        totalDuration.setSeconds(seconds);

        summary.setDuration(totalDuration);

        return summary;
    }

    public Summary getSummaryByUserAndType(User user, Type type) {
        List<Activity> activities = activityRepository.findByUserIdAndTypeId(user.getId(), type.getId());
        return getSummary(activities);
    }

    public Map<Challenge, Progress> getProgressAndChallenges (Long id) {
        User user = userRepository.findById(id).get();

        List<Challenge> challenges = getAllChallenges();
        Map<Challenge, Progress> challengeProgressMap = new HashMap<>();

        for (Challenge c : challenges) {
            Type type = c.getType();

            Summary summary = getSummaryByUserAndType(user, type);

            Float challengeDistance = c.getDistance(); //behöver springa 30.0 km för att klara challenge
            Float summaryDistance = summary.getDistance(); //användaren har sprungit totalt 15.0km

            Progress progress = new Progress();
            if (challengeDistance > summaryDistance) { //
                progress.setProgress((summaryDistance/challengeDistance )); //progress blir då 0.5
            } else {
                progress.setProgress(1f);
            }
            challengeProgressMap.put(c, progress);
        }
        return challengeProgressMap;
    }

    public void postComment(User user, Long ActivityId, String commentText) {
        Comment comment = new Comment();
        comment.setText(commentText);
        comment.setUser(user);
        comment.setDateTime(LocalDateTime.now().toString());

        Activity activity = activityRepository.findById(ActivityId).get();
        activity.getComments().add(comment);

        activityRepository.save(activity);
    }

    public void checkUserBadges(User user, Badge badge) {

        if (user.getBadges().containsKey(badge.getId())) {
            return;
        } else {
            user.getBadges().put(badge.getId(), badge);
            saveUser(user);
        }
    }

    public Object getBadgesFromUserId(Long userId) {
        User user = userRepository.findById(userId).get();
        return user.getBadges();
    }

    public Badge checkForBadgesAfterPostingActivity(User user, Activity activity, Long activityTypeId) {
        Map<Challenge, Progress> challengeProgressMap = getProgressAndChallenges(user.getId());

        for (Challenge value: challengeProgressMap.keySet()) {
            if (value.getType().getId().equals(activityTypeId)) {

                Float preDistanceProgress =  challengeProgressMap.get(value).getProgress();
                Float newActivityProgress = activity.getDistance()/ value.getDistance();
                Float totalProgress = preDistanceProgress + newActivityProgress;

                if(preDistanceProgress < 1 && totalProgress > 1 || !user.getBadges().containsKey(value.getBadge().getId())) {
                    checkUserBadges(user, value.getBadge());
                    return value.getBadge();
                }
            }

        }
        return null;
    }
}
