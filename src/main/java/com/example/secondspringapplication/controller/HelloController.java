package com.example.secondspringapplication.controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello from bridgelabz";
    }
}
