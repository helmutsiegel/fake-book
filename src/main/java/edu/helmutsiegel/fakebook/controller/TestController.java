package edu.helmutsiegel.fakebook.controller;

import edu.helmutsiegel.fakebook.dal.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
