package com.example.taskmanager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000") // Replace with your frontend URL
@RestController
@RequestMapping("/api")
public class TaskController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Task Manager is running!";
    }
}
