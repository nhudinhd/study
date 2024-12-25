package com.study.common.response;

import com.study.enums.ApiResponseCode;

public class ApiResponseGenerator {

    public static ApiResponse<Void> success() {
        return new ApiResponse<>(ApiResponseCode.SUCCESS);
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(ApiResponseCode.SUCCESS, ApiResponseCode.SUCCESS.getDefaultMessage(), data);
    }

    public static ApiResponse<Void> fail(ApiResponseCode code, String msg) {
        return new ApiResponse<>(code, msg, null);
    }
}
