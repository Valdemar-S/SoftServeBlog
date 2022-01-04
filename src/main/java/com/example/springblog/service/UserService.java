package com.example.springblog.service;

import com.example.springblog.entities.User;
import com.example.springblog.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(String id) {
        User user = findById(id);
        user.isDeleted = true;
        saveUser(user);
    }

    public User findById(String id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}


// Интерфейсы