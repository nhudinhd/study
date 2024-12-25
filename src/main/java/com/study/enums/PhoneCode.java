package com.study.enums;

import lombok.Getter;

@Getter
public enum PhoneCode {

    VN("+84");
    private final  String phoneCode;

    PhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
