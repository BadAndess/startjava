package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int attemptCounter;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attemptCounter);
    }

    public int getNumber() {
        return numbers[attemptCounter - 1];
    }

    public void setNumber(int number) {
        numbers[attemptCounter] = number;
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public void setAttemptCounter(int attemptCounter) {
        this.attemptCounter = attemptCounter;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, attemptCounter, 0);
    }
}