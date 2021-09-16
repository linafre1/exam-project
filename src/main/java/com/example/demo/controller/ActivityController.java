package com.example.demo.controller;

import com.example.demo.*;
import com.example.demo.business.MainService;
import com.example.demo.database.ActivityRepository;
import com.example.demo.database.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ActivityController {

    @Autowired
    MainService service;

    @GetMapping("/logActivity")
    public String logActivity(Model model) {
        Activity activity = new Activity();
        List<Type> types = service.getTypes();
        model.addAttribute("activity", activity);
        model.addAttribute("types", types);
        return "activityForm";
    }

    @GetMapping("/editActivity")
    public String editActivity (@RequestParam Long activityId, Model model) {
        model.addAttribute("activity", service.getActivity(activityId));
        model.addAttribute("types", service.getTypes());
        return "activityForm";
    }

    //Gets all the information of an activity as an object, calls a method to see if a badge is claimed
    //calls service to save the activity
    @PostMapping("/saveActivity")
    public String saveActivity (@ModelAttribute Activity activity,@RequestParam Long activityType, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Badge badge = service.checkForBadgesAfterPostingActivity(user, activity, activityType);
        activity.setUser(user);
        service.saveActivity(activity, activityType);
        String currentPage = (String) session.getAttribute("currentPage");

        if (badge != null) {
            session.setAttribute("gotBadge", badge);
            return "redirect:/getSummaryForUser?userId="+user.getId();
        }

        return "redirect:" + currentPage;
    }

    @GetMapping("/clearWonBadge")
        public String clearWonBadge(HttpSession session){
        session.setAttribute("gotBadge", null);
        User user = (User) session.getAttribute("user");
        return "redirect:/getSummaryForUser?userId="+user.getId();
    }

    @GetMapping("/activityDetail")
    public String activityDetail (@RequestParam Long activityId, Model model) {
        model.addAttribute("activityDetail", service.getActivity(activityId));
        return "masterDetail";
    }


}
