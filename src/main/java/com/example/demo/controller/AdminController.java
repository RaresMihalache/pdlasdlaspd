package com.example.demo.controller;

import com.example.demo.model.PetSitter;
import com.example.demo.model.User;
import com.example.demo.service.AdminService;
import com.example.demo.service.SitterService;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("admin")
@AllArgsConstructor
public class AdminController {

    private AdminService adminService;
    private SitterService sitterService;

    @GetMapping("index")
    public String index(){
        return "admin/index";
    }

    @GetMapping("viewUsers")
    public String showUsers(Model model){
        List<User> listUsers = adminService.viewUsers();
        model.addAttribute("listUsers", listUsers);
        return "admin/viewUsers";
    }

    @GetMapping("searchBy")
    public String searchBy(Model model){
        return "admin/searchBy";
    }

    @GetMapping("viewSubs")
    public String viewSubscribers(Model model){
        List<PetSitter> listSitters = sitterService.viewSubscribedSitters();
        model.addAttribute("listSitters", listSitters);
        return "admin/viewSubs";
    }

}
