package com.example.springsecuritysample.controller;

import com.example.springsecuritysample.constant.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole(Role.ROLE_ADMIN.name())) {
            return "redirect:/admin";
        }
        if (request.isUserInRole(Role.ROLE_EMPLOYEE_MANAGER.name())) {
            return "redirect:/employee";
        }
        if (request.isUserInRole(Role.ROLE_PROJECT_MANAGER.name())) {
            return "redirect:/project";
        }
        return "redirect:";
    }
}
