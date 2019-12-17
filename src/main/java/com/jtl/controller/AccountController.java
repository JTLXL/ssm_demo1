package com.jtl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JT.L
 * @date 2019/12/17 14:32:35
 * @description 账户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("表现层：查询所有账户...");
        return "list";
    }
}
