package com.example.springblog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    public String login;
    public String password;
    public int role;
}
