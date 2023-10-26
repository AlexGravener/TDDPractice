package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add_1_and_2_results_in_3(){
//        Triple 'A' pattern
//        Arrange: gather the things by test needs
        double num1 = 1;
        double num2 = 2;
        double expectedResult = 3;
//        Act: invoke the code we are testing
        double actualResult = Calculator.add(num1, num2);
//        Assert: confirm the results
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_2_and_2_results_in_4(){
        double num1 = 2;
        double num2 = 2;
        double expectedResult = 4;
        double actualResult = Calculator.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_negative2_and_2_results_in_4(){
        double num1 = -2;
        double num2 = 2;
        double expectedResult = 0;
        double actualResult = Calculator.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_2point6_and_1point3_results_in_3point9(){
        double num1 = 2.6;
        double num2 = 1.3;
        double expectedResult = 3.9;
        double actualResult = Calculator.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}