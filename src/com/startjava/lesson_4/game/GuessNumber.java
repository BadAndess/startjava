package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int guessedNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.setAttemptCounter(0);
        player2.setAttemptCounter(0);
        player1.fillArray();
        player2.fillArray();
        guessedNumber = random.nextInt(101);

        System.out.println("У каждого игрока по 10 попыток ");
        System.out.println("Я загадал число от 0 до 100 ");
        System.out.println(guessedNumber);

        for (int i = 0; i < 10; i++) {
            if (moves(player1)) {
                break;
            } else if (moves(player2)) {
                break;
            }
        }
        
        printNumbers(player1);
        printNumbers(player2);
    }

    private boolean moves(Player player) {
        System.out.println(player.getName() + " введите свое число ");
        player.setNumber(scanner.nextInt());
        player.setAttemptCounter(player.getAttemptCounter() + 1);

        if (checkNumber(player)) {
            return true;
        }
        if (player.getAttemptCounter() == 10) {
            System.out.println("У " + player.getName() + " - закончились попытки! ");
        }
        return false;
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == guessedNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + guessedNumber + " с " + player.getAttemptCounter() + " попытки ");
            return true;
        } else if (player.getNumber() > guessedNumber) {
            System.out.println("Данное число больше того, что я загадал ");
        } else if (player.getNumber() < guessedNumber) {
            System.out.println("Данное число меньше того, что я загадал ");
        }
        return false;
    }

    private void printNumbers(Player player) {
        for (int number : player.getArrayNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
