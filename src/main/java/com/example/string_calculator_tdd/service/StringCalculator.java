package com.example.string_calculator_tdd.service;

public class StringCalculator {

	public int add(String numbers) {
		if(numbers == null || numbers.isEmpty()) {
			return 0;
		}
		throw new UnsupportedOperationException("implementation failed");
	}
}
