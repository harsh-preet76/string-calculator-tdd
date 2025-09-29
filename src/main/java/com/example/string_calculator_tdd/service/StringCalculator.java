package com.example.string_calculator_tdd.service;

public class StringCalculator {

	public int add(String numbers) {
		
		if(numbers == null || numbers.isEmpty()) {
			return 0;
		}
		
		String[] parts = numbers.split(",");
		int sum = 0;
		for (String part: parts) {
			sum += Integer.parseInt(part);
		}
		
		return sum;
	}
}
