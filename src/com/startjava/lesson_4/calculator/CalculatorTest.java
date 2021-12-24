package com.startjava.lesson_4.calculator;

import java.util.Scanner;

/**
 * Модифицируйте программу Калькулятор:
 * используйте следующий формат ввода (пример):
 * Введите математическое выражение: 2 ^ 10
 * введенное выражение храните в массиве.
 * В этом поможет метод String.split()
 * для преобразования чисел выражения из String в int
 * используйте метод Integer.parseInt()
 * замените методами класса Math, какие только сможете найти,
 * ваши реализации вычислений
 * метод calculate() должен возвращать результат вычисления.
 * Выводите его в CalculatorTest
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while (option.equals("yes")) {
            System.out.println("Enter a mathematical expression separated by a space ");
            String expression = scanner.nextLine();
            System.out.println(expression + " = " + calculator.calc(expression));

            do {
                System.out.println("Want to continue the calculations? [yes/no]: ");
                option = scanner.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        }
    }
}