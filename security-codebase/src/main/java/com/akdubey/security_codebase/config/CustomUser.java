package com.akdubey.security_codebase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class CustomUser {

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin1 = User
                .builder()
                .username("akshay")
                .password(bCryptPasswordEncoder().encode("akshay"))
                .roles("admin")
                .authorities("read","write")
                .build();

        UserDetails admin2 = User
                .builder()
                .username("preetam")
                .password(bCryptPasswordEncoder().encode("preetam"))
                .roles("admin")
                .authorities("read")
                .build();
        return new InMemoryUserDetailsManager(admin1, admin2);
    }
}
