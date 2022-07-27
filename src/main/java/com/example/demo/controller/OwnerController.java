package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("owner")
public class OwnerController {

    @GetMapping("index")
    public String index(){
        return "owner/index";
    }

    @GetMapping("viewProfile")
    public String viewProfile(){
        return "owner/viewProfile";
    }

    @GetMapping("searchSitter")
    public String searchSitter(){
        return "owner/searchSitter";
    }

    @GetMapping("makeAppointment")
    public String makeAppointment(){
        return "owner/makeAppointment";
    }

}
