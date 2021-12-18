package com.startjava.lesson_4.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private char sign;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calc() {
        switch (sign) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= number2; i++) {
                    result *= number1;
                }
                System.out.println(result);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("Incorrect sign ");
        }
    }
}