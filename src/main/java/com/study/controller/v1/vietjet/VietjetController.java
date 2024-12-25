package com.study.controller.v1.vietjet;

import com.study.common.response.ApiResponse;
import com.study.common.response.ApiResponseGenerator;
import com.study.dto.v1.vietjet.request.FlightBookingRequest;
import com.study.dto.v1.vietjet.request.FlightSearchRequest;
import com.study.dto.v1.vietjet.response.FlightHistoryResponse;
import com.study.dto.v1.vietjet.response.FlightResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping({"/api/v1/vietjet"})
@RestController
@Slf4j
@RequiredArgsConstructor
public class VietjetController {

    @PostMapping("/flights/search")
    public ResponseEntity<ApiResponse<FlightResponse>> searchFlight(@ModelAttribute FlightSearchRequest flightSearchRequest) {
        return new ResponseEntity<>(
                ApiResponseGenerator.success(FlightResponse.mockData()),
                HttpStatus.OK);
    }

    @PostMapping("/flights")
    public ResponseEntity<ApiResponse<Void>> bookFlight(@RequestBody FlightBookingRequest flightBookingRequest) {
        return new ResponseEntity<>(ApiResponseGenerator.success(), HttpStatus.OK);
    }


    @PostMapping("me/{user_id}/flights")
    public ResponseEntity<ApiResponse<FlightHistoryResponse>> getFlightHistory() {
        return new ResponseEntity<>(ApiResponseGenerator.success(null), HttpStatus.OK);
    }
}
