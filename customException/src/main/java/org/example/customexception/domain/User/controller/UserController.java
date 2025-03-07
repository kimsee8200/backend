package org.example.customexception.domain.User.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<?> register(){
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(){
        return null;
    }

}

