package com.shop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/test")
    public ResponseEntity<String> getTestData(){
        return ResponseEntity.ok("Hello !");
    }
}
