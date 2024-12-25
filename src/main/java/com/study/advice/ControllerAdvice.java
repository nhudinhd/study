package com.study.advice;

import com.study.common.response.ApiResponse;
import com.study.common.response.ApiResponseGenerator;
import com.study.enums.ApiResponseCode;
import com.study.exceptions.BookingException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(BookingException.class)
    public ResponseEntity<ApiResponse<?>> exceptionHandling(BookingException e, HttpServletRequest request) {
        String message = e.getMessage();

        return new ResponseEntity<>(ApiResponseGenerator.fail(ApiResponseCode.BOOKING_ERROR, message), HttpStatus.CONFLICT);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> exceptionHandling(Exception e, HttpServletRequest request) {
        String message = e.getMessage();

        return new ResponseEntity<>(ApiResponseGenerator.fail(ApiResponseCode.SERVER_ERROR, message), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
