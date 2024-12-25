package com.study.dto.v1.vietjet.response;

import com.study.dto.v1.vietjet.FlightLocation;
import com.study.enums.Airline;
import com.study.enums.FlightType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class FlightPlaceResponse {

    private String flightNo;
    private FlightType flightType;
    private FlightLocation from;
    private FlightLocation to;
    private Airline airline;
    private String totalTimeFlight;
    private String airBus;
}
