package com.example.springsecuritysample.controller.employeemanager;

import com.example.springsecuritysample.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
@AllArgsConstructor
public class ProjectManagerIndexController {
    private final AccountService accountService;

    @RequestMapping("")
    public String index() {
        return "projectmanager/index";
    }
}
