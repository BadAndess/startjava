package com.startjava.lesson_4.workout;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        System.out.print("Enter numbers of array ");

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 0; i < arrayLength - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        System.out.println("Max number is " + max);
    }
}