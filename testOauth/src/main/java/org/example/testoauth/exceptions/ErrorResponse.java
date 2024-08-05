package org.example.testoauth.exceptions;

public record ErrorResponse(
        ErrorCode errorCode,
        String message
) {
}
