package org.example.testoauth.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHendler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> CustomExceptionHendler(CustomException e){
        return responseMaker(e.getErrorCode(),e.getMessage());
    }

    public ResponseEntity<ErrorResponse> responseMaker(ErrorCode errorCode, String message){
        return ResponseEntity.status(errorCode.getErrorNum())
                .body(new ErrorResponse(errorCode,message));
    }

}
