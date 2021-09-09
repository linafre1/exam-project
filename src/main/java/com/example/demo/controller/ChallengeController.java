package com.example.demo.controller;
import com.example.demo.business.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

@Controller
public class ChallengeController {

    @Autowired
    MainService service;

    @GetMapping("/showChallenges")
    public String showChallenges(Model model) {
        model.addAttribute("challenges", service.getAllChallenges());
        return "allChallenges";
    }

    @GetMapping("/showProgress")
    public String showProgress(HttpSession session) {
        session.setAttribute("progressMap", service.getProgressAndChallenges(1L));
        return "progressBar";
    }

}
