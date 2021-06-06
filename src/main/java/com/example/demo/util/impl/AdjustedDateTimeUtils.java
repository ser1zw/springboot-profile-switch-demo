package com.example.demo.util.impl;

import com.example.demo.util.DateTimeUtils;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Profile("with-adjusteddatetime")
public class AdjustedDateTimeUtils implements DateTimeUtils {
    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now().minusDays(1);
    }
}
