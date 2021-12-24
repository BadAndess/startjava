package com.startjava.lesson_4.calculator;

public class Calculator {

    public int calc(String expression) {
        String[] str = expression.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);

        switch (str[1]) {
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