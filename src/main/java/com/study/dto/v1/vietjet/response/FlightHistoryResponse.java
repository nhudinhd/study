package com.study.dto.v1.vietjet.response;

import com.study.dto.v1.vietjet.AdultBooking;
import com.study.dto.v1.vietjet.ChildrenBooking;
import lombok.Data;

@Data
public class FlightHistoryResponse {

    private AdultBooking auAdultBooking;
    private ChildrenBooking childrenBooking;
    private FlightPlaceResponse flightPlaceResponse;
}
