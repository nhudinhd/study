package com.study.enums;

import lombok.Getter;

@Getter
public enum Country {

    VN("Việt Nam");
    private final String country;

    Country(String country) {
        this.country = country;
    }
}
