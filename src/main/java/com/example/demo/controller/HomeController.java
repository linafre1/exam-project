package com.example.demo.controller;

import com.example.demo.Activity;
import com.example.demo.Challenge;
import com.example.demo.User;
import com.example.demo.business.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    MainService service;

    @GetMapping("/")
    public String landingPage () {
        return "landingPage";
    }

    @GetMapping("/home")
    public String home(HttpSession session) {

        User user = (User)session.getAttribute("user");
        if (user == null) {
            return "redirect:/";
        }
        session.setAttribute("currentPage", "home");

        List<Activity> activities = getActivityList(user);
        session.setAttribute("activities",activities);
        List<Challenge> challenges = service.getAllChallenges();
        session.setAttribute("challenges", challenges);
        session.setAttribute("allUsers", service.getNotBefriendedUsers(user));
        return "home";
    }

    @GetMapping("/sendFriendRequest")
    public String friiendList(HttpSession session, @RequestParam Long friendId) {
        User user = (User) session.getAttribute("user");
        if (user != null) {
            service.saveFriendRequest(user, friendId);
            session.setAttribute("friends", user.getFriends());
        }
        String currentPage = (String) session.getAttribute("currentPage");
        return "redirect:" + currentPage;
    }

    /*@GetMapping("/sendFriendRequestFromHome")
    public String sendFriendRequest(HttpSession session, @RequestParam Long friendId) {
        User user = (User) session.getAttribute("user");
        if (user != null) {
            service.saveFriendRequest(user, friendId);
            session.setAttribute("friends", user.getFriends());
        }
        return "redirect:/home";
    }*/

    @GetMapping("/friendRequest")
    public String friendList(HttpSession session, @RequestParam Long friendId, @RequestParam boolean accept) {
        User user = (User) session.getAttribute("user");
        if (user != null) {
            service.saveFriend(user, friendId, accept);
        }
        return "home";
    }

    @GetMapping("/user")
    public String friendList(HttpSession session, @RequestParam Long userId) {
        User user = service.getUser(userId);
        session.setAttribute("user",user);

        List<Activity> activities = getActivityList(user);
        session.setAttribute("activities",activities);

        String currentPage = (String) session.getAttribute("currentPage");
        return "redirect:" + currentPage;
    }


    private List<Activity> getActivityList(User user) {
        List<Activity> activities = service.getActivityListWithFriends(user);
        activities.addAll(service.getActivityList(user));
        return activities;
    }

    @ModelAttribute("allUsers")
    public List<User> allUsers(HttpSession session) {
        return service.getAllUsers();
    }

    @ModelAttribute("alias")
    public String alias(HttpSession session) {
        User user = (User)session.getAttribute("user");
        return user == null? "Guest":user.getAlias();
    }



}
