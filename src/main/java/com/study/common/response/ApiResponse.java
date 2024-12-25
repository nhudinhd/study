package com.study.common.response;

import com.study.enums.ApiResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApiResponse<T> {

    private String code;
    private String message;
    private T data;

    public ApiResponse(ApiResponseCode apiResponseCode) {
        this(apiResponseCode, null, null);
    }

    public ApiResponse(ApiResponseCode apiResponseCode, String responseMessage, T data) {
        this.code = apiResponseCode.getCode();
        this.message = responseMessage;
        this.data = data;
    }
}
