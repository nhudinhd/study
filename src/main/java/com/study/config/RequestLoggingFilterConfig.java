package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggingFilterConfig {

    @Bean
    public CommonsRequestLoggingFilter commonsRequestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeHeaders(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setMaxPayloadLength(10000);
        loggingFilter.setBeforeMessagePrefix("RequestLoggingFilter > Before : ");
        loggingFilter.setBeforeMessageSuffix("");
        loggingFilter.setAfterMessagePrefix("RequestLoggingFilter > After : ");
        loggingFilter.setAfterMessageSuffix("");
        return loggingFilter;
    }
}
