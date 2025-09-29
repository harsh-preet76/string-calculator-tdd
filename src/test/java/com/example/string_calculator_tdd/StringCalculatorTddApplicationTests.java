package com.example.string_calculator_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
	
	@Test
	void customDelimitedNumbersHandling() {
		assertEquals(9, calc.add("//;\n2;7"));
	}
	
	@Test
	void negativeNumbersThrowExceptionHandling() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> { calc.add("1,-2,3,-4"); });
		assertEquals("Negative numbers are not allowed: ", exception.getMessage());
	}
}
