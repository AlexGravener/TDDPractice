package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add_1_and_2_results_in_3(){
//        Triple 'A' pattern
//        Arrange: gather the things by test needs
        int num1 = 1;
        int num2 = 2;
        int expectedResult = 3;
//        Act: invoke the code we are testing
        int actualResult = Calculator.add(num1, num2);
//        Assert: confirm the results
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_2_and_2_results_in_4(){
        int num1 = 2;
        int num2 = 2;
        int expectedResult = 4;
        int actualResult = Calculator.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_negative2_and_2_results_in_4(){
        int num1 = -2;
        int num2 = 2;
        int expectedResult = 0;
        int actualResult = Calculator.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

}