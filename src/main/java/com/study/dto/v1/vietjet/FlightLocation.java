package com.study.dto.v1.vietjet;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class FlightLocation {

    private LocalDateTime time;
    private String city;
    private String airPortName;
    private String locationCode;
}
