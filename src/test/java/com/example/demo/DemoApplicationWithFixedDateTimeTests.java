package com.example.demo;

import com.example.demo.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
// import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("with-fixeddatetime")
// @TestPropertySource(properties = "spring.profiles.active=with-fixeddatetime") // @ConditionalOnExpression を使う場合はこちら
class DemoApplicationWithFixedDateTimeTests {
	@Autowired
	DemoService demoService;

	@Test
	void test() {
		assertEquals("2021/01/02 12:34:56", demoService.getMessage());
	}
}
