package org.example.customexception.domain.User.exception;

import org.example.customexception.global.exception.CustomException;
import org.example.customexception.global.exception.ErrorCode;

public class UserNoExistException extends CustomException {

    public static UserNoExistException exception = new UserNoExistException();
    public UserNoExistException() {
        super(ErrorCode.NOT_FOUND, "잘못된 유저 정보입니다.");
    }

}
