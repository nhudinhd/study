package com.study.dto.v1.vietjet.request;

import com.study.dto.v1.vietjet.AdultBooking;
import com.study.dto.v1.vietjet.ChildrenBooking;
import lombok.Data;

@Data
public class FlightBookingRequest {

    private AdultBooking adultBooking;
    private ChildrenBooking childrenBooking;
    private boolean isSaveForFuture;
}
