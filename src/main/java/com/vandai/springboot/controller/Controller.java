package com.vandai.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String test() {
        return "test";
    }

    @GetMapping("fake")
    public ResponseEntity<?> fake() {
        return new ResponseEntity<>("fake", HttpStatus.OK);
    }

    @GetMapping("fake2")
    public ResponseEntity<?> fake2() {
        return new ResponseEntity<>("fake2", HttpStatus.OK);
    }


}
