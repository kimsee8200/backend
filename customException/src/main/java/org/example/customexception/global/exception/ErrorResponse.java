package org.example.customexception.global.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public record ErrorResponse(

        HttpStatus errorCode,
        String message
) {
}
