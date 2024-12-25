package com.study.dto.v1.vietjet;

import com.study.dto.v1.vietjet.request.PhoneNumber;
import com.study.enums.Country;
import com.study.enums.Gender;
import com.study.enums.Social;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AdultBooking {

    private Gender gender;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private PhoneNumber phoneNumber;
    private Country country;
    private String email;
    private String personalId;
    private String location;
    private String skyJoyNumber;
    private Social socialConnect;
    private boolean isReceiveSalesInfo;
    private String seatCode;
    private Long quantity;
}
