package org.example.customexception.global.security.Exception;

import lombok.RequiredArgsConstructor;
import org.example.customexception.global.exception.CustomException;
import org.example.customexception.global.exception.ErrorCode;

public class TokenExpiredException extends CustomException {


    TokenExpiredException tokenExpiredException = new TokenExpiredException();
    public TokenExpiredException() {
        super(ErrorCode.UNCORRECT_REQUEST, "token is expired");
    }
}
