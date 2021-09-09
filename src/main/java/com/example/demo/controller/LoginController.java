package com.example.demo.controller;

import com.example.demo.User;
import com.example.demo.business.MainService;
import com.example.demo.database.UserRepository;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    MainService service;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginForm(HttpSession session, @RequestParam String username, @RequestParam String password) {
        User user = service.logIn(username, password);
        if (user != null) {
            session.setAttribute("isLoggedIn", true);
            session.setAttribute("user", user);
            return "redirect:/home";
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("isLoggedIn", false);
        session.setAttribute("user", null);
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String createUser(@ModelAttribute User user){
        service.saveUser(user);
        return "redirect:/login";
    }




}
