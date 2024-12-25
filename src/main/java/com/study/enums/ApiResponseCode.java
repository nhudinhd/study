package com.study.enums;

import lombok.Getter;

@Getter
public enum ApiResponseCode {

    SUCCESS                     ("200", "OK"),
    SERVER_ERROR                     ("500", "Server error"),
    BOOKING_ERROR                     ("409", "Booking ticket error"),
    ;
    private final String code;


    private final String defaultMessage;

    ApiResponseCode(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

}
