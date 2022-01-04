package com.example.springblog.entities;

import com.example.springblog.entities.baseEntity.BaseEntity;
import com.example.springblog.entities.enums.UserRole;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    public String username;
    @NotNull
    public String password;
    public boolean isDeleted;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }


    public void setPassword(String password) { this.password = password; }

    public String getPassword() { return password; }

    public void setUsername(String username) { this.username = username; }

    public String getUsername() { return username; }
}