package org.johari.securewebapplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UsersController {
    @GetMapping
    public List<String> GetUsers() {
        return Arrays.asList("aakash.johari@live.com", "asthana.neha26@gmail.com", "aakashjohari.in@gmail.com");
    }
}
