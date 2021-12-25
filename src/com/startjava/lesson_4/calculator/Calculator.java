package com.startjava.lesson_4.calculator;

public class Calculator {

    public int calc(String expression) {
        String[] splittedExpression = expression.split(" ");
        int a = Integer.parseInt(splittedExpression[0]);
        int b = Integer.parseInt(splittedExpression[2]);

        switch (splittedExpression[1]) {
            case "+":
                return Math.abs(a + b);
            case "-":
                return Math.abs(a - b);
            case "/":
                return Math.abs(a / b);
            case "*":
                return Math.abs(a * b);
            case "^":
                return (int) Math.pow(a, b);
            default:
                System.out.println("Incorrect sign ");
        }
        return 0;
    }
}
