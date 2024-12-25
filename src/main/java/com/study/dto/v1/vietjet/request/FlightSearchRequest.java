package com.study.dto.v1.vietjet.request;

import com.study.dto.v1.vietjet.FlightLocation;
import com.study.enums.TicketType;
import lombok.Data;

import java.util.List;

@Data
public class FlightSearchRequest {

    private FlightLocation from;
    private FlightLocation to;
    private List<PassengerRequest> passengerRequests;
    private TicketType ticketType;
    private boolean isSearchByMinPrice;
}
