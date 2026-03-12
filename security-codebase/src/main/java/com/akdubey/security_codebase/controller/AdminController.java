package com.akdubey.security_codebase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {

    @GetMapping("/admin1")
    public String checkingAdminRoleController() {
        return "Checking Admin Role";
    }

    @GetMapping("/write/admin2")
    public String checkingAdminAuthorityController() {
        return "Checking Admin Authority";
    }
}
