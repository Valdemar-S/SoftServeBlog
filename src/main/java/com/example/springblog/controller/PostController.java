package com.example.springblog.controller;

import com.example.springblog.entities.Post;
import com.example.springblog.security.Access;
import com.example.springblog.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @Access.Admin
    @PostMapping
    public void addPost(@RequestBody Post post) {
        postService.savePost(post);
    }
}
