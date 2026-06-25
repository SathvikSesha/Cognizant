package com.cognizant.junit.exercise_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void testAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }
}