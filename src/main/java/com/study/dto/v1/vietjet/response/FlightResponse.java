package com.study.dto.v1.vietjet.response;

import com.study.dto.v1.vietjet.FlightLocation;
import com.study.enums.AirfareClass;
import com.study.enums.Airline;
import com.study.enums.FlightType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class FlightResponse {

    List<FlightDateResponse> flightDateResponses;

    public static FlightResponse mockData() {
        return new FlightResponse(List.of(
                FlightDateResponse
                        .builder()
                        .flightDate(LocalDate.now())
                        .minPrice(BigDecimal.ONE)
                        .timeLineResponses(List.of(
                                        TimeLineResponse
                                                .builder()
                                                .flightPlaceResponse(
                                                        FlightPlaceResponse.
                                                                builder()
                                                                .flightNo("VJ194")
                                                                .flightType(FlightType.DIRECT)
                                                                .from(FlightLocation
                                                                        .builder()
                                                                        .time(LocalDateTime.now())
                                                                        .city("Hà Nội")
                                                                        .airPortName("Tân Sơn Nhất")
                                                                        .locationCode("HN")
                                                                        .build())
                                                                .to(FlightLocation
                                                                        .builder()
                                                                        .time(LocalDateTime.now())
                                                                        .city("Hồ Chí Minh")
                                                                        .airPortName("Tân Sơn Nhất")
                                                                        .locationCode("HCM")
                                                                        .build())
                                                                .airline(Airline.VIETJET_AIR)
                                                                .totalTimeFlight("2h 10 phút")
                                                                .airBus("A320").build())
                                                .airfareClassResponses(
                                                        List.of(
                                                                AirfareClassResponse
                                                                        .builder()
                                                                        .airfareClass(AirfareClass.BUSINESS)
                                                                        .benefitsNotReceived(List.of("Hành lý xách tay: 10kg"))
                                                                        .benefitsNotReceived(List.of("Bộ tiện ích 3 trong 1"))
                                                                        .emptySeat(1L)
                                                                        .build()

                                                        )
                                                )
                                                .build()
                                )

                        )
                        .build()

        ));
    }
}
