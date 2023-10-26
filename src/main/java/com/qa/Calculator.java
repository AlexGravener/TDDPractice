package com.qa;

public class Calculator {

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        String stringResult = Double.toString(result);
        for (String chr : stringResult)
        return result;
    }
}
