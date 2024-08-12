package org.example.customexception.global.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Builder
public record ErrorResponse(

        HttpStatusCode errorCode,
        String message
) {
}
