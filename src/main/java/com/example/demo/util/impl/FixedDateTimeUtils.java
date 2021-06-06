package com.example.demo.util.impl;

import com.example.demo.util.DateTimeUtils;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Profile("with-fixeddatetime")
public class FixedDateTimeUtils implements DateTimeUtils {
    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.of(2021, 1, 2, 12, 34, 56);
    }
}
