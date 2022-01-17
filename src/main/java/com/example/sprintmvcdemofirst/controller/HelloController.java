package com.example.sprintmvcdemofirst.controller;

import com.example.sprintmvcdemofirst.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public ResponseEntity<Book> getTest() {
        return ResponseEntity.ok(null);
    }

//    @GetMapping("/error")
//    public String testE() {
//        return "error.html";
//    }
}
