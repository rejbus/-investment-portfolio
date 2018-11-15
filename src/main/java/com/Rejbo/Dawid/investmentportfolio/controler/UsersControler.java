package com.Rejbo.Dawid.investmentportfolio.controler;

import com.Rejbo.Dawid.investmentportfolio.model.Users;
import com.Rejbo.Dawid.investmentportfolio.repository.InvestemtRepository;
import com.Rejbo.Dawid.investmentportfolio.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersControler {

    @Autowired
    private InvestemtRepository investemtRepository;
    @Autowired
    private UsersRepository usersRepository;


    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @GetMapping("/contact.html")
    public String showContact() {
        return "contact";
    }

    @GetMapping("/registration.html")
    public String addUsersPage() {
        return "registration";


    }
}










