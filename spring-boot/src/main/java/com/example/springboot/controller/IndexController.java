package com.example.springboot.controller;

import com.example.springboot.model.Book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
        //return new ResponseEntity<>("ok", HttpStatus.OK);
        return ResponseEntity.ok("ok");
    }

    @RequestMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("healthy");
    }

}