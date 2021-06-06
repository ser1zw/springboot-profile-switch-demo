package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        var message = demoService.getMessage();
        return Map.of("message", message);
    }
}
