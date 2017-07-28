package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        ReversePolishCalc reversePolishCalc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = reversePolishCalc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)
        rpnExpression = "4.2,1.0,-";
        expectedResult = 3.2;
        actualResult = reversePolishCalc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "2.0,3.0,*";
        expectedResult = 6.0;
        actualResult = reversePolishCalc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "25.0,5.0,/";
        expectedResult = 5.0;
        actualResult = reversePolishCalc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = reversePolishCalc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
    }


