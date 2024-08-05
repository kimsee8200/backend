package org.example.testoauth.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    ILLEGAL_REGISTRATION_ID(400,"잘못된 ID");


    private final Integer ErrorNum;
    private final String ErrorMessage;
}
