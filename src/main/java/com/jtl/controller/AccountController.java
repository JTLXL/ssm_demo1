package com.jtl.controller;

import com.jtl.domain.Account;
import com.jtl.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author JT.L
 * @date 2019/12/17 14:32:35
 * @description 账户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService as;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = as.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    /*@RequestMapping("/saveAccount")
    public String save(Account account) {
        as.saveAccount(account);
        return "redirect:findAll";
    }*/

    /*@RequestMapping("/saveAccount")
    public void save(Account account, HttpServletResponse response) throws Exception {
        as.saveAccount(account);
        response.sendRedirect("findAll");
        return;
    }*/

    /**
     * 这种方式最复杂，但是耦合度最低，因为没有用到相对路径，前面两种方式也可以但是用了相对路径
     * @param account
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/saveAccount")
    public void save(Account account, HttpServletRequest request,HttpServletResponse response) throws Exception {
        as.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
