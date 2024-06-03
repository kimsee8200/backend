package com.example.valid.controller;

import com.example.valid.model.Api;
import com.example.valid.model.UserRegisterRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping
public class UserApiController {
    @PostMapping("")
    public ResponseEntity<Api<? extends Object>> register(@Valid @RequestBody Api<UserRegisterRequest> userRegisterRequest, BindingResult bindingResult){
        log.info("init : {}", userRegisterRequest);


        if(bindingResult.hasErrors()){
            var errorMessageList = bindingResult.getFieldErrors().stream()
                    .map(it ->{
                        var format = "%s : { %s } 은 %s ";
                        var message = String.format(format, it.getField(), it.getRejectedValue(), it.getDefaultMessage());
                        return message;
                    }).collect(Collectors.toList());

            var error = Api.Error.builder()
                    .errorMessage(errorMessageList)
                    .build();

            var errorResponse = Api
                    .builder()
                    .resultCode(String.valueOf(HttpStatus.BAD_REQUEST.value()))
                    .resultMessage(HttpStatus.BAD_REQUEST.getReasonPhrase())
                    .error(error)
                    .build();

            return  errorResponse;
        }

        var body = userRegisterRequest.getData();
        Api<UserRegisterRequest> response = Api.<UserRegisterRequest>builder()
                .resultCode(String.valueOf(HttpStatusCode.valueOf(200)))
                .resultMessage(HttpStatus.OK.getReasonPhrase())
                .data(body)
                .build();

        return response;
    }
}
