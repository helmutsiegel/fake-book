package edu.helmutsiegel.fakebook.controller;

import edu.helmutsiegel.fakebook.dal.model.PostEntity;
import edu.helmutsiegel.fakebook.dal.repository.PostJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostJpaRepository postJpaRepository;

    @GetMapping("/post")
    public List<PostEntity> getAllUser() {
        return postJpaRepository.findAll();
    }
}
