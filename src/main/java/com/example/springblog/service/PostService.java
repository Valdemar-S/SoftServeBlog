package com.example.springblog.service;

import com.example.springblog.entities.Post;
import com.example.springblog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public void savePost(Post post) {
        postRepository.save(post);
    }
}
