package edu.helmutsiegel.fakebook.controller;

import edu.helmutsiegel.fakebook.dal.model.UserEntity;
import edu.helmutsiegel.fakebook.dal.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping("/user")
    public List<UserEntity> getAllUser() {
        return userJpaRepository.findAll();
    }
}
