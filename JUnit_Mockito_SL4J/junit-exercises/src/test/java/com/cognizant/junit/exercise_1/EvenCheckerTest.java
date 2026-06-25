package com.cognizant.junit.exercise_1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EvenCheckerTest {

	@Test
	void EvenCheckTest() {
		EvenChecker checker = new EvenChecker();
		assertTrue(checker.EvenNumber(10));
	}

	@Test
	void EvenCheckTest2() {
		EvenChecker checker = new EvenChecker();
		assertFalse(checker.EvenNumber(11));
	}
}
