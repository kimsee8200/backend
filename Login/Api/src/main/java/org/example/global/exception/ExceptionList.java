package org.example.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;

@Getter
@RequiredArgsConstructor
public enum ExceptionList {

    NO_USER_EXIST(HttpStatusCode.valueOf(404),"유저가 존제하지 않습니다");

    private final HttpStatusCode statusCode;
    private final String errorMessage;
}
