package com.Rejbo.Dawid.investmentportfolio.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersControler {


    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @GetMapping("/contact.html")
    public String showContact() {
        return "contact";}

        @RequestMapping("/registration.html")
    public String showRegistration(){
        return "registration";
     }

    }


