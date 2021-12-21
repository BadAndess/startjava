package com.startjava.lesson_4.workout;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        String expression = "1 + 5";
        String[] str = expression.split(" ");
        for (String number : str) {
            System.out.println(number);
        }

            int  a = Integer.parseInt(str[0]);
            int  b = Integer.parseInt(str[2]);
            int result;
            switch (str[1]){
                case "+":
                    result = a + b;
                    System.out.println(result);
                    break;
            }
        }
    }
