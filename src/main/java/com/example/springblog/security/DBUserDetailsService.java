package com.example.springblog.security;

import com.example.springblog.entities.User;
import com.example.springblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.Collection;

@Component
public class DBUserDetailsService implements UserDetailsService {
        @Autowired
        private UserRepository repository;

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            User user = repository.findByUsername(username).orElseThrow();
            Collection<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(user.getUserRole().name()));
            return new SecurityUser(user.getId(),user.getUsername(),user.getPassword(),authorities);
        }
    }
