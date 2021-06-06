package com.example.demo;

import com.example.demo.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    DemoService demoService;

    @Test
    void test() {
        var date = demoService.getMessage().split(" ")[0];
        var today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        assertEquals(today, date);
    }
}
