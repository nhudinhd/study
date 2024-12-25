package com.study.dto.v1.vietjet.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TimeLineResponse {

    private FlightPlaceResponse flightPlaceResponse;
    private List<AirfareClassResponse> airfareClassResponses;
}
