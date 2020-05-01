package com.lgc.mvc.controller;

import com.lgc.entity.Admin;
import com.lgc.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *@Author Crush
 *@Date 2020/5/1 16:26
 *@Vision 1.0
 **/
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/test/ssm.html")
    public String test(Model model){
        List<Admin> adminList = adminService.findAll();
        model.addAttribute("adminList",adminList);
        return "target";
    }
}
