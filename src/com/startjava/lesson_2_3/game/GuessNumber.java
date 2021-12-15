package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int guessedNumber = random.nextInt(101);
        System.out.println("Я загадал число от 0 до 100 ");
        System.out.println(guessedNumber);

        do {
            System.out.println(player1.getName() + " введите свое число ");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == guessedNumber) {
                System.out.println(player1.getName() + " число угадано!");
                break;
            } else if (player1.getNumber() > guessedNumber) {
                System.out.println("Данное число больше того, что я загадал ");
            } else if (player1.getNumber() < guessedNumber) {
                System.out.println("Данное число меньше того, что я загадал ");
            }

            System.out.println(player2.getName() + " введите свое число ");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == guessedNumber) {
                System.out.println(player2.getName() + " число угадано!");
                break;
            } else if (player2.getNumber() > guessedNumber) {
                System.out.println("Данное число больше того, что я загадал ");
            } else if (player2.getNumber() < guessedNumber) {
                System.out.println("Данное число меньше того, что загадал ");
            }
        } while (true);
    }
}