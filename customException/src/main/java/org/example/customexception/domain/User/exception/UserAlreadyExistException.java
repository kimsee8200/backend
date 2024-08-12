package org.example.customexception.domain.User.exception;

import org.example.customexception.global.exception.CustomException;
import org.example.customexception.global.exception.ErrorCode;

public class UserAlreadyExistException extends CustomException {

    public UserAlreadyExistException() {
        super(ErrorCode.UNCORRECT_REQUEST, "이미 존재하는 아이디 입니다");
    }
}
