package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Test {

    @GetMapping("/{id}")
    public String getId(@PathVariable("id") Long id) {
        return "Hello,World\n这个是" + id;
    }
}
