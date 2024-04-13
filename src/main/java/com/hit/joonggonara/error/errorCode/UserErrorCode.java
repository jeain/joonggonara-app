package com.hit.joonggonara.error.errorCode;

import com.hit.joonggonara.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@Getter
@RequiredArgsConstructor
public enum UserErrorCode implements ErrorCode {

    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "존재하지 않은 회원입니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
