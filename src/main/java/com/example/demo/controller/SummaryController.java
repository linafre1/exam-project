package com.example.demo.controller;

import com.example.demo.User;
import com.example.demo.business.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Summary;

import javax.servlet.http.HttpSession;

@Controller
public class SummaryController {

    @Autowired
    MainService service;

    @GetMapping("/getSummary")
    public String getSummary(HttpSession session) {
        User user = (User)session.getAttribute("user");
        if(user == null) {
            return "/home";
        }
        session.setAttribute("profileDetail", service.getUser(user.getId()));
        session.setAttribute("progressMap", service.getProgressForChallenges(user.getId()));
        Summary summary = service.getSummaryById(user.getId());
        session.setAttribute("summary", summary);
        return "summary";
    }
    @GetMapping("/getSummaryForUser")
    public String getSummaryForUser(HttpSession session, @RequestParam Long userId) {
        User currentUser = (User)session.getAttribute("user");
        session.setAttribute("currentPage", "/getSummaryForUser?userId="+userId);
        session.setAttribute("profileDetail", service.getUser(userId));

        if (currentUser.getFriends().containsKey(userId) || currentUser.getId().equals(userId)) {
            session.setAttribute("badges", service.getBadgesFromUserId(userId));
            session.setAttribute("progressMap", service.getProgressForChallenges(userId));
            Summary summary = service.getSummaryById(userId);
            session.setAttribute("activities", service.getActivityList(service.getUser(userId)));
            session.setAttribute("summary", summary);
            return "summary";
        } else {
            return "viewProfile";
        }
    }

}
