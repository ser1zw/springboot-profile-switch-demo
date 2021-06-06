package com.example.demo;

import com.example.demo.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
// import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("with-adjusteddatetime")
// @TestPropertySource(properties = "spring.profiles.active=with-adjusteddatetime") // @ConditionalOnExpression を使う場合はこちら
class DemoApplicationWithAdjustedDateTimeTests {
    @Autowired
    DemoService demoService;

    @Test
    void test() {
        var date = demoService.getMessage().split(" ")[0];
        var yesterday = LocalDateTime.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        assertEquals(yesterday, date);
    }
}
