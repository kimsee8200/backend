package com.example.valid.controller;

import com.example.valid.model.UserRegisterRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class UserApiController {
    @PostMapping("")
    public UserRegisterRequest register(@Valid @RequestBody UserRegisterRequest userRegisterRequest){
        log.info("init : {}", userRegisterRequest);

        return userRegisterRequest;
    }
}
