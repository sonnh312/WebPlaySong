package dev.example.songs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class HomeController {
    @GetMapping("/")
    public String Home()
    {
        return "Hello, Home!";
    }
    @GetMapping("/secured")
    public String Secured()
    {
        return "Hello, Secured!";
    }
}
