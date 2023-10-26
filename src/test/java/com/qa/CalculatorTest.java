package com.qa;

import jdk.jfr.Label;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("Divide 10 by 2")
    public void divide_10_by_2() {
        double num1 = 10;
        double num2 = 2;
        double expectedResult = 5;

        double actualResult = Calculator.divide(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Divide by double 0 gives infinity")
    public void divide_by_double_0_gives_infinity() {
        double num1 = 5;
        double num2 = 0;
        double expectedResult = Double.POSITIVE_INFINITY;

        double actualResult = Calculator.divide(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Divide by double 0 gives infinity")
    public void divide_by_int_0_gives_infinity() {
        int num1 = 5;
        int num2 = 0;

        assertThrows(ArithmeticException.class, () -> Calculator.divide(num1, num2));
    }
}