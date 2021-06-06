package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import com.example.demo.util.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DateTimeUtils dateTimeUtils;

    public String getMessage() {
        var dateTime = dateTimeUtils.getDateTime().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        return dateTime;
    }
}
