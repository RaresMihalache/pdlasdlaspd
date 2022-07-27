package com.example.demo.controller;

import com.example.demo.model.Owner;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {


    @Autowired
    private UserService userService;

    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("register")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "register_form";
    }

    @PostMapping("register")
    public String submitForm(@ModelAttribute("user") User user){
        String message = userService.registerUser(user);
        if(message == "-1")
            return "register_found_user";
        else if(message == "-2")
            return "register_passwords_dont_match";
        else if(message == "-3")
            return "no_role_selected";
        return "register_success";
    }
}
