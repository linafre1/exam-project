package com.example.demo.controller;

import com.example.demo.Summary;
import com.example.demo.business.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@Controller
public class ProfileController {

    @Autowired
    MainService service;

    @GetMapping("/profileDetail/{profileId}")
    public String profileDetail (@PathVariable Long profileId, Model model, HttpSession session) {

        model.addAttribute("profileDetail", service.getUser(profileId));
        session.setAttribute("progressMap", service.getProgressForChallenges(profileId));
        Summary summary = service.getSummaryById(profileId);
        session.setAttribute("activities", service.getActivityList(service.getUser(profileId)));
        session.setAttribute("summary", summary);
//        List<Challenge> challenges = service.getAllChallenges();
//        session.setAttribute("challenges", challenges);

        return "masterDetail";
    }

}
