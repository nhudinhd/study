package com.study.dto.v1.vietjet.request;

import com.study.enums.PhoneCode;
import lombok.Data;

@Data
public class PhoneNumber {

    private PhoneCode phoneCode;
    private String phoneNumber;
}
