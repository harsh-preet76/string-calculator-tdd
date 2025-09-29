package com.example.string_calculator_tdd.service;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers == null || numbers.isEmpty()) {
			return 0;
		}

		String delimiter = ",";
		String input = numbers;

		if (numbers.startsWith("//")) {
			int delimitedEndIndex = numbers.indexOf("\n");
			System.out.println("Delimiter End: " + delimitedEndIndex);
			delimiter = numbers.substring(2, delimitedEndIndex);
			System.out.println("Delimeter: " + delimiter);  
			input = numbers.substring(delimitedEndIndex + 1);
			System.out.println("Input: " + input);
		}

		String[] parts = input.split("[\n" + delimiter + "]");
		int sum = 0;
		for (String part : parts) {
			System.out.println("Part Values: " + part);
			if (!part.isEmpty()) {
				sum += Integer.parseInt(part);
			}
		}
		System.out.println("Sum Values: " + sum);
		return sum;
	}

}