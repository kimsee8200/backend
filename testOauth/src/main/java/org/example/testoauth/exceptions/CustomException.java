package org.example.testoauth.exceptions;

import lombok.Getter;

@Getter
public abstract class CustomException extends RuntimeException{

    private final ErrorCode errorCode;
    private final String message;

    public CustomException(ErrorCode errorCode){
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
        this.message = errorCode.getErrorMessage();
    }

    public CustomException(ErrorCode errorCode, String message){
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

}
