package com.example.string_calculator_tdd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StringCalculator {

	static Logger log = Logger.getLogger(StringCalculator.class.getName());

	public int add(String numbers) {

		if (numbers == null || numbers.isEmpty()) {
			return 0;
		}

		String delimiter = ",";
		String input = numbers;

		if (numbers.startsWith("//")) {
			int delimitedEndIndex = numbers.indexOf("\n");
			log.info("Delimiter End: " + delimitedEndIndex);

			delimiter = numbers.substring(2, delimitedEndIndex);
			log.info("Delimeter: " + delimiter);

			input = numbers.substring(delimitedEndIndex + 1);
			log.info("Input: " + input);
		}

		String[] parts = input.split("[\n" + delimiter + "]");
		int sum = 0;
		List<Integer> negatives = new ArrayList<>();

		for (String part : parts) {
			log.info("Part Values: " + part);
			if (!part.isEmpty()) {
				int value = Integer.parseInt(part);
				if (value < 0) {
					negatives.add(value);
				}
				sum += value;
			}
		}

		if (!negatives.isEmpty()) {
			throw new IllegalArgumentException("Negative numbers are not allowed: "
					+ negatives.stream().map(String::valueOf).collect(Collectors.joining(",")));
		}

		log.info("Sum Values: " + sum);
		return sum;
	}

}