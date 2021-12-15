package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

/**
 * создайте класс CalculatorTest, который будет содержать метод main и
 * отвечать за создание объектов, их инициализацию, ввод математического
 * выражения и запуск вычислений
 * класс Calculator будет содержать код, отвечающий за проверку
 * математического знака и сами вычисления
 * замените все if else, отвечающие за проверку математического знака,
 * на оператор switch
 * для ввода математического выражения используйте клавиатуру и класс Scanner
 * формат ввода математического выражения:
 * Введите первое число: 2
 * Введите знак математической операции: ^
 * Введите второе число: 10
 * по окончанию каждого вычисления выводите сообщение "Хотите продолжить
 * вычисления? [yes/no]:" (реализуйте это в CalculatorTest):
 * yes — пользователю заново предлагается ввести математическое выражение
 * no — программа завершается
 * при вводе иного значения выводите сообщение до тех пор, пока не будут
 * введены допустимые ответы
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while (option.equals("yes")) {
            System.out.println("Enter first number ");
            calculator.setNumber1(scanner.nextInt());

            System.out.println("Enter operation ");
            calculator.setSign(scanner.next().charAt(0));

            System.out.println("Enter second number");
            calculator.setNumber2(scanner.nextInt());

            calculator.calc();

            scanner.nextLine();
            do {
                System.out.println("Want to continue the calculations? [yes/no]: ");
                option = scanner.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        }
    }
}