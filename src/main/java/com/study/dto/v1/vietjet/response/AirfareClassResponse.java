package com.study.dto.v1.vietjet.response;

import com.study.enums.AirfareClass;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AirfareClassResponse {

    private AirfareClass airfareClass;
    private List<String> benefitsReceived;
    private List<String> benefitsNotReceived;
    private Long emptySeat;
    private String seatCode;
}
