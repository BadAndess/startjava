package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public void calc() {
        String expression = scanner.nextLine();
        String[] str = expression.split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);

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
            default:
                System.out.println("Incorrect sign ");
        }
    }
}