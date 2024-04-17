package com.example.restservice;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.restservice.repository.UserRepository;
import com.example.restservice.model.Users;

@RestController
@RequestMapping("home")
public class HomeController {
    UserRepository userRepository;

    @GetMapping(path = "/holi")
    public Map<String, String> greeting() {
        return Collections.singletonMap("message", "Hello, World");
    }

    @GetMapping(path = "/all")
    public Iterable<Users> getAllUsers() {
        // This returns a JSON or XML with the users
        Iterable<Users> data = userRepository.findAll();
        return data;
    }
}
