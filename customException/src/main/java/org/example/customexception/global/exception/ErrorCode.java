package org.example.customexception.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    UNCORRECT_REQUEST(HttpStatusCode.valueOf(400),"잘못된 요청"),
    NOT_FOUND(HttpStatusCode.valueOf(404),"영구 없다."),
    AUTH_FAIL(HttpStatusCode.valueOf(401),"인증실패"),
    USER_NOT_ROLE(HttpStatusCode.valueOf(403),"권한 없음");

    private final HttpStatusCode Code;
    private final String message;

}
