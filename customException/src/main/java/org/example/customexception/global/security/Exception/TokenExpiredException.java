package org.example.customexception.global.security.Exception;

<<<<<<< HEAD
import lombok.RequiredArgsConstructor;
=======
>>>>>>> deliverService-make
import org.example.customexception.global.exception.CustomException;
import org.example.customexception.global.exception.ErrorCode;

public class TokenExpiredException extends CustomException {

<<<<<<< HEAD

    TokenExpiredException tokenExpiredException = new TokenExpiredException();
    public TokenExpiredException() {
        super(ErrorCode.UNCORRECT_REQUEST, "token is expired");
    }
}
