package com.akdubey.security_codebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityCodebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityCodebaseApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("password"));
	}

}
