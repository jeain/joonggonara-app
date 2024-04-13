package com.hit.joonggonara.dto.response;

import com.hit.joonggonara.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class ApiExceptionResponse {

    private final boolean success;
    private final String httpStatus;
    private final String message;


    public static ApiExceptionResponse of(ErrorCode errorCode){
        return new ApiExceptionResponse(false, errorCode.getHttpStatus().name(), errorCode.getMessage());
    }


}
