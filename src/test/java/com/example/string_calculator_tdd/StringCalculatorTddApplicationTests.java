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
	
	@Test
	void singleNumberHandling() {
		assertEquals(1, calc.add("1"));
		assertEquals(8, calc.add("8"));
	}
	
	@Test
	void twoNumersSumHandling() {
		assertEquals(8, calc.add("3,5"));
	}
}
