package com.Rejbo.Dawid.investmentportfolio.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersControler {


    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/project")
    public String showPrjkect() {
        return "wallet";
    }
}