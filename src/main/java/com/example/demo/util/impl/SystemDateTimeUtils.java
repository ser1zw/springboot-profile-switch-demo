package com.example.demo.util.impl;

import com.example.demo.util.DateTimeUtils;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Profile("!with-fixeddatetime && !with-adjusteddatetime")
// @ConditionalOnExpression("#{ not ('${spring.profiles.active}' matches '^with-.+') }") // 正規表現で指定する場合はこちら
public class SystemDateTimeUtils implements DateTimeUtils {
    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
