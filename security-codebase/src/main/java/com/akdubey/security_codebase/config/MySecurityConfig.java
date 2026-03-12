package com.akdubey.security_codebase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        HttpSecurity httpSecurity = http.
                httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(
                        auth -> auth.requestMatchers("/public/**").permitAll()
                                .requestMatchers("/admin/**").hasRole("admin")
                                .anyRequest().authenticated());
        return httpSecurity.build();
    }
}
