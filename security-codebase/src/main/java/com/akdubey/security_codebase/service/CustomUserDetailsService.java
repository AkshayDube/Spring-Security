package com.akdubey.security_codebase.service;

import com.akdubey.security_codebase.entities.UserEntity;
import com.akdubey.security_codebase.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> byUsername = userRepo.findByUsername(username);
        UserEntity userEntity = byUsername.get();

        return User.builder()
                .username(userEntity.username)
                .password(userEntity.password)
                .authorities(
                        "ROLE_" + userEntity.role,
                        userEntity.authority
                )
                .build();
    }
}
