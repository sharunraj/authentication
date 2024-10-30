package com.example.authentication.service;

import com.example.authentication.enitity.UserCredentialsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private String name;
    private String password;
    public CustomUserDetails(UserCredentialsEntity user) {
        this.name = user.getName();
        this.password = user.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

}
