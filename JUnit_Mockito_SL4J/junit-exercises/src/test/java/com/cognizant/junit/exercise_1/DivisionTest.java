package com.cognizant.junit.exercise_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DivisionTest {
	@Test
	void divisionBetweenTwoNumbersTest1() {
		Divider division = new Divider();
		assertThrows(ArithmeticException.class,()->division.division(10, 0));
	}
	@Test
	void divisionBetweenTwoNumbersTest2() {
		Divider division = new Divider();
		double result = division.division(10, 2);
		assertEquals(5d,result);
	}
}
