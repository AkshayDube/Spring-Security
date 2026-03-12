package com.akdubey.security_codebase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/public")
@RestController
public class PublicController {

    @GetMapping("/public1")
    public String checkPublicController()
    {
        return "Checking Public Controller";
    }
}
