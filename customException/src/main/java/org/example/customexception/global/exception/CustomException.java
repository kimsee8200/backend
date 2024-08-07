package org.example.customexception.global.exception;


public abstract class CustomException extends RuntimeException{

    private ErrorCode errorCode;
    private String message;

    public CustomException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.message = errorCode.getMessage();
    }

    public CustomException(ErrorCode errorCode, String message){
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }


}
