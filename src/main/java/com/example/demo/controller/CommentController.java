package com.example.demo.controller;

import com.example.demo.Activity;
import com.example.demo.Comment;
import com.example.demo.User;
import com.example.demo.business.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class CommentController {

    @Autowired
    MainService service;

    @PostMapping("/postComment")
    public String postComment(HttpSession session, @RequestParam Long activityId, @RequestParam String commentText) {
        User user = (User) session.getAttribute("user");

        if (user != null) {
            service.postComment(user, activityId, commentText);
            String currentPage = (String) session.getAttribute("currentPage");
            return "redirect:" + currentPage;

        }
        return "home";
    }
}
