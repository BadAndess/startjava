package com.startjava.lesson_1.game;
/**
 * Напишите игру Угадай число:
 * компьютер "загадывает" целое число от (0 до 100], которое необходимо угадать
 * после каждой неудачной попытки выводите подсказку:
 * "Данное число больше того, что загадал компьютер" или
 * "Данное число меньше того, что загадал компьютер"
 * если число угадано — "Поздравляю, число угадано!"
 * меняйте значение переменной, хранящей числа игрока, автоматически по какому-то простому алгоритму
 * (без применения ввода с клавиатуры или генерации рандомных чисел)
 * игра продолжается до тех пор, пока число не будет угадано
 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int guessedNumber = random.nextInt(101);
        System.out.println(guessedNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Я загадал число от 0 до 100 ");
        int playerNumber;

        do {
            System.out.println("Введите свое число ");
            playerNumber = scanner.nextInt();
            if (playerNumber > guessedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер, ведите  число ");
            } else if (playerNumber < guessedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер, введите  число  ");
            }
        } while (playerNumber != guessedNumber);
        System.out.println("Поздравляю, число угадано! ");
    }
}
