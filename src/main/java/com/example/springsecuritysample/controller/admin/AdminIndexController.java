package com.example.springsecuritysample.controller.admin;

import com.example.springsecuritysample.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminIndexController {
    private final AccountService accountService;

    @RequestMapping("")
    public String index() {
        return "admin/index";
    }
}
