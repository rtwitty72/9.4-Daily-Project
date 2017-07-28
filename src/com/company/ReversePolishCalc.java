package com.company;

/**
 * Created by macbookpro on 7/25/17.
 */

import java.util.*;

public class ReversePolishCalc {
    private Stack<Double> stack = new Stack();
    private String[] tokens;

    public double calculate(String input) throws ArithmeticException, EmptyStackException {

        tokens = input.split(",");

        for (String token : tokens)

            switch (token) {
                case "+":
                    System.out.println("Operation: Addition!");
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    System.out.println("Operation: Subtraction");
                    stack.push(-stack.pop() + stack.pop());
                    break;

                case "*":
                    System.out.println("Operation: Multiplication");
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    System.out.println("Operation: Division");
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;

                default:
                    double dToken = Double.parseDouble(token);
                    stack.push(dToken);
                    break;
            }
        System.out.println("Final result = "+stack.peek());
        return stack.peek();
    }
}











