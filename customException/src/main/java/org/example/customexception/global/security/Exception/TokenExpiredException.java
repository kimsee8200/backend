package org.example.customexception.global.security.Exception;

import org.example.customexception.global.exception.CustomException;
import org.example.customexception.global.exception.ErrorCode;

public class TokenExpiredException extends CustomException {

    public TokenExpiredException tokenNoExistException = new TokenExpiredException();
    public TokenExpiredException() {
        super(ErrorCode.UNCORRECT_REQUEST,"token is Expired");
    }
}
