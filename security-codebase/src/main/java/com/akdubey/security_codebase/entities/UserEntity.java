package com.akdubey.security_codebase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
    @GeneratedValue
    @Id
    public Long id;

    public String username;

    public String password;

    public String role;

    public String authority;
}
