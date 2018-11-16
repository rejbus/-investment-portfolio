package com.Rejbo.Dawid.investmentportfolio.controler;

import com.Rejbo.Dawid.investmentportfolio.model.Users;
import com.Rejbo.Dawid.investmentportfolio.model.UsersInvestments;
import com.Rejbo.Dawid.investmentportfolio.repository.InvestemtRepository;
import com.Rejbo.Dawid.investmentportfolio.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class UsersControler {


    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private InvestemtRepository investemtRepository;


    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @GetMapping("/contact.html")
    public String showContact() {
        return "contact";
    }

    @RequestMapping("/add")
    public String addNewUser(@RequestParam String name, @RequestParam String pass,
                             @RequestParam String surname, @RequestParam String email,
                             @RequestParam String login, ModelMap modelMap) {


        Users users = new Users();
        users.setEmail(email);
        users.setName(name);
        users.setLogin(login);
        users.setPass(pass);
        users.setSurname(surname);
        usersRepository.save(users);
        modelMap.put("users", users);

        return "/show";


    }

    @GetMapping("/registration.html")
    public String getRegistration() {
        return "/registration";
    }

    @GetMapping("/idshow")
    public String showId(ModelMap modelMap) {
        modelMap.put("users", usersRepository.findAll());
        return "idshow";
    }

    @RequestMapping("/addInv")
    public String addIN(@RequestParam Integer income, @RequestParam String stock, @RequestParam Integer expense,
                        @RequestParam String bonds, @RequestParam Integer valueBonds, @RequestParam Integer valueStock, ModelMap modelMap) {
        UsersInvestments usersInvestments = new UsersInvestments();
        usersInvestments.setDailyExpenses(expense);
        usersInvestments.setIcome(income);
        usersInvestments.setNameBonds(bonds);
        usersInvestments.setNameStock(stock);
        usersInvestments.setValueBonds(valueBonds);
        usersInvestments.setValueStock(valueStock);
        investemtRepository.save(usersInvestments);
        modelMap.put("usersInvestments", usersInvestments);
        return "/";



    }@GetMapping ("/invshow")
    public String showInv(ModelMap modelMap){
        modelMap.put("usersInvestments", investemtRepository.findAll());
        return "/showinvest";


}




}










