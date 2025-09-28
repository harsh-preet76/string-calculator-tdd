package com.example.string_calculator_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.string_calculator_tdd.service.StringCalculator;

@SpringBootTest
class StringCalculatorTddApplicationTests {

	StringCalculator calc = new StringCalculator();
	
	@Test
	void emptyStringHandling() {
		assertEquals(0, calc.add(""));
	}
}
