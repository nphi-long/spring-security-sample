package com.example.springsecuritysample.controller.projectmanager;

import com.example.springsecuritysample.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeManagerIndexController {
    private final AccountService accountService;

    @RequestMapping("")
    public String index() {
        return "employeemanager/index";
    }
}
