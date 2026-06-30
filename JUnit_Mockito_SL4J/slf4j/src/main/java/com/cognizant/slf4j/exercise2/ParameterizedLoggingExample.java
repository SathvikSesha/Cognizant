package com.cognizant.slf4j.exercise2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

	private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

	public static void main(String[] args) {

		String username = "John";
		String course = "Java Backend";
		int exercisesCompleted = 15;

		logger.info("User {} has enrolled in {}", username, course);

		logger.info("User {} completed {} exercises", username, exercisesCompleted);

		logger.warn("User {} has only {}% attendance", username, 72);

		logger.error("Failed to process request for user {}", username);

	}
}