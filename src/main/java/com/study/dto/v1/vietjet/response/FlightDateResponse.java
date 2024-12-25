package com.study.dto.v1.vietjet.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class FlightDateResponse {

    private LocalDate flightDate;
    private BigDecimal minPrice;
    private List<TimeLineResponse> timeLineResponses;
}
