package com.example.springsecuritysample.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    ROLE_ADMIN("ADMIN"),
    ROLE_PROJECT_MANAGER("PROJECT_MANAGER"),
    ROLE_EMPLOYEE_MANAGER("EMPLOYEE_MANAGER");

    private String name;
}
