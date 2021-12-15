package com.startjava.lesson_1.conditionalstatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Ready to the army ");
        }

        boolean male = true;
        if (male) {
            System.out.println("Give him  trousers ");
        }

        if (!male) {
            System.out.println("Give it to the skirt");
        }

        double height = 1.85;
        if (height < 1.8) {
            System.out.println("Tanks troops ");
        } else {
            System.out.println("VDV ");
        }

        char firstNameLetter = 'M';
        if (firstNameLetter == 'M') {
            System.out.println("His name is Michael ");
        } else if (firstNameLetter == 'I') {
            System.out.println("His name is Ivan");
        } else {
            System.out.println("Incorrect name");
        }
    }
}