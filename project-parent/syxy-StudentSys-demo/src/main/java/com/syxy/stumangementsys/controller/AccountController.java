package com.syxy.stumangementsys.controller;

import com.syxy.stumangementsys.entities.Account;
import com.syxy.stumangementsys.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/login")
    public String login(Model model, Account account, HttpServletRequest request){

       Account account1 = accountService.login(account);
        if (account1 != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user",account1);
            return "StuMenu";
        }
        model.addAttribute("loginErrorMsg","用户名或密码错误！请重新输入。");
        return "index";
    }


}
