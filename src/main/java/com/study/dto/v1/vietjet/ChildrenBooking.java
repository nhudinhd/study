package com.study.dto.v1.vietjet;

import com.study.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ChildrenBooking {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private String seatCode;
    private Long quantity;
}
