package org.example.customexception.global.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> customExceptionH(CustomException e){

        ErrorResponse errorResponse = ErrorResponse.builder()
                .errorCode(e.getErrorCode().getCode())
                .message(e.getMessage())
                .build();

        return new ResponseEntity<>(errorResponse,e.getErrorCode().getCode());
    }

}
