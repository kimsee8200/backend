package com.example.valid.controller;

import com.example.valid.model.Api;
import com.example.valid.model.UserRegisterRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class UserApiController {
    @PostMapping("")
    public Api<UserRegisterRequest> register(@Valid @RequestBody Api<UserRegisterRequest> userRegisterRequest){
        log.info("init : {}", userRegisterRequest);


        var body = userRegisterRequest.getData();
        var response = Api.<UserRegisterRequest>builder()
                .resultCode(String.valueOf(HttpStatusCode.valueOf(200)))
                .resultMessage(HttpStatus.OK.getReasonPhrase())
                .data(body)
                .build();

        return response;
    }
}
