package com.cognizant.junit.exercise_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculatorAAATest {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testAddition() {

        int a = 15;
        int b = 10;

        int result = calculator.add(a, b);

        assertEquals(25, result);
    }

}