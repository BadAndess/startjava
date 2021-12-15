package com.startjava.lesson_1.calculator;
/**
 *
 * Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми
 * положительными числами:
 * что бы программа могла выполнить ту или иную математическую операцию (одну, а не все сразу),
 * делайте проверку математического знака, используя if else
 * выведите на экран результат вычисления с помощью System.out.println()
 * Символ ^ используется в данном задании для обозначения операции возведения в степень,
 * но в Java он выполняет совсем иную функцию. Использовать его для возведения в степень не получится.
 * Самостоятельно реализуйте данную операцию (не используйте Math.pow())
 * Символ %, похожий на проценты, называется оператором деления по модулю.
 * В калькуляторе не надо считать проценты! Считайте остаток от деления
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int number1 = scanner.nextInt();

        System.out.println("Enter operation ");
        char sign = scanner.next().charAt(0);

        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

        if (sign == '+') {
            System.out.println(number1 + number2);
        } else if (sign == '-') {
            System.out.println(number1 - number2);
        } else if (sign == '*') {
            System.out.println(number1 * number2);
        } else if (sign == '/') {
            System.out.println(number1 / number2);
        } else if (sign == '^') {
            int result = 1;
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
            System.out.println(result);
        } else if (sign == '%') {
            System.out.println(number1 % number2);
        } else {
            System.out.println("Incorrect sign ");
        }
    }
}