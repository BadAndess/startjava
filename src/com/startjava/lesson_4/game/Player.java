package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] arrayNumbers = new int[10];
    private int attemptCounter;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getArrayNumbers() {
        return Arrays.copyOf(arrayNumbers, attemptCounter);
    }

    public int getNumber() {
        return arrayNumbers[attemptCounter - 1];
    }

    public void setNumber(int number) {
        arrayNumbers[attemptCounter] = number;
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public void setAttemptCounter(int attemptCounter) {
        this.attemptCounter = attemptCounter;
    }

    public void fillArray() {
        Arrays.fill(arrayNumbers, 0, attemptCounter, 0);
    }
}