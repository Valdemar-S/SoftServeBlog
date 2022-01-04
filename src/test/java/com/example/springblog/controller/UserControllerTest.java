package com.example.springblog.controller;

import com.example.springblog.entities.User;
import com.example.springblog.entities.enums.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.util.Assert;


@WithMockUser(username = "user", password = "pass")
@WebMvcTest(UserController.class)
public class UserControllerTest {


    @Test
    public void shouldCreateUser() {
        User user = new User();
        user.setUsername("User111111");
        user.setPassword("12354");
        user.setDeleted(false);
        user.setUserRole(UserRole.USER);

        Assert.notNull(user.getPassword(), "error");

    }


}
