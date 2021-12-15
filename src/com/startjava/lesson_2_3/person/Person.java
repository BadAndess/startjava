package com.startjava.lesson_2_3.person;
/**
 * Создайте класс Person (без метода main)
 * Напишите в нем поля (атрибуты), описывающие характеристики человека:
 * пол, имя, рост, вес, возраст
 * Проинициализируйте их какими-то значениями
 * Создайте в классе методы, описывающие поведение (что он может делать)
 * человека: идти, сидеть, бежать, говорить, учить Java
 */
public class Person {

    String sex = "male";
    String name = "Bob";
    int height = 185;
    int weight = 95;
    int age = 25;

    void go() {
        System.out.println("GO");
    }

    void sit() {
        System.out.println("Sit");
    }

    void run(){
        System.out.println("Run");
    }

    void talk(){
        System.out.println("Talk");
    }

    void learnJava(){
        System.out.println("Learn Java");
    }
}
