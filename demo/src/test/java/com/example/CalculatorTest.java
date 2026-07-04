package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition(){

        assertEquals(4, calculator.add(2,2));

    }

    @Test
    void testSubtraction(){

        assertEquals(2, calculator.subtract(5,3));

    }

    @Test
    void testMultiplication(){

        assertEquals(12, calculator.multiply(3,4));

    }

    @Test
    void testDivision(){

        assertEquals(5, calculator.divide(10,2));

    }

    @Test
    void testDivideByZero(){

        Exception exception =
                assertThrows(IllegalArgumentException.class,
                        () -> calculator.divide(10,0));

        assertEquals("Cannot divide by zero",
                exception.getMessage());

    }

}