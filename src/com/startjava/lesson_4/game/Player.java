package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] attempts = new int[10];
    private int attemptCounter;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getArrayNumbers() {
        return Arrays.copyOf(attempts, attemptCounter);
    }

    public int getNumber() {
        return attempts[attemptCounter - 1];
    }

    public void setNumber(int number) {
        attempts[attemptCounter] = number;
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public void setAttemptCounter(int attemptCounter) {
        this.attemptCounter = attemptCounter;
    }

    public void fillArray() {
        Arrays.fill(attempts, 0, attemptCounter, 0);
    }
}