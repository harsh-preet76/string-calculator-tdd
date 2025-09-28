package com.example.string_calculator_tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringCalculatorTddApplicationTests {

	@Test
	void emptyStringHandling() {
		assertEquals(0, calc.add(""));
	}
}
