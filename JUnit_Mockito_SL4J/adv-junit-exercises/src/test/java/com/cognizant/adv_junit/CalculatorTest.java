package com.cognizant.adv_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	Calculator cal;
	@BeforeEach
	void setup() {
		cal = new Calculator();
	}
	
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
		"2,3,5",
		"10,4,14",
		"5,5,10"
	})
	void test(int a,int b,int expected) {
		assertEquals(expected,cal.add(a,b));
	}
	
	@AfterEach
	void tearDown() {
		cal = null;
	}
}
