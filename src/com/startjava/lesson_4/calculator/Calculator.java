package com.startjava.lesson_4.calculator;

public class Calculator {

    int  a = Integer.parseInt(str[0]);
    int  b = Integer.parseInt(str[2]);
    int result;

    public void calc() {
        switch (str[1]) {
            case "+":
                System.out.println(Math.abs(a + b));
                break;
            case "-":
                System.out.println(Math.abs(a - b));
                break;
            case "/":
                System.out.println(Math.abs(a / b));
                break;
            case "*":
                System.out.println(Math.abs(a * b));
                break;
            case "^":
                System.out.println(Math.pow(a, b));
                break;
        }
    }

}