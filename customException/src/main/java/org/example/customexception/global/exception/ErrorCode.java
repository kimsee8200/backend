package org.example.customexception.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    NOT_FOUND(HttpStatusCode.valueOf(404),"영구 없다.");

    private final HttpStatusCode Code;
    private final String message;

}
