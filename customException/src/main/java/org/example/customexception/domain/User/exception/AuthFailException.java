package org.example.customexception.domain.User.exception;

import org.example.customexception.global.exception.CustomException;
import org.example.customexception.global.exception.ErrorCode;

public class AuthFailException extends CustomException {
    public AuthFailException authFailException = new AuthFailException();
    public AuthFailException() {
        super(ErrorCode.AUTH_FAIL);
    }
}
