package org.example.testoauth.domain.User.exception;

import org.example.testoauth.exceptions.CustomException;
import org.example.testoauth.exceptions.ErrorCode;

public class AuthException extends CustomException {
    public AuthException(ErrorCode errorCode){
        super(errorCode);
    }
}
