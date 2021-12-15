package com.startjava.lesson_2_3.robot;

/**
 * Модифицируйте класс Jaeger, сделав его универсальным
 * (без инициализации полей в самом классе, как мы это делали в уроке).
 * Это позволит на его основе создавать любого робота:
 * выберите два или более разных роботов. Найдите между ними что-то общее
 * (поля, методы). Реализуйте это в коде (не усложняйте реализацию.
 * Делайте все максимально просто)
 * создайте 2 экземпляра класса Jaeger в классе JaegerTest и поэкспериментируйте с ними
 * (проинициализируйте поля, вызывайте методы, перезаписывайте и выводите значения полей)
 * для инициализации полей объектов при их создании используйте в начале сеттеры
 * (покажите решение ментору), а потом перепишите, используя конструктор
 */
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger danger = new Jaeger("Gipsy Danger", "Mark-3",
                "USA", 260f, 1.98f, 8, 6);

        System.out.println(danger.getModelName() + "\n" + danger.getMark() + "\n"
                + danger.getOrigin() + "\n" + danger.getHeight() + "\n" + danger.getWeight() +
                "\n" + danger.getStrength() + "\n" + danger.getArmor());

        danger.drift();
        danger.move();
        danger.scanKaiju();
        danger.useVortexCannon();

        Jaeger typhoon = new Jaeger("Crimson Typhoon", "Mark-4", "USA",
                260f, 2.2f, 8, 6);

        System.out.println(typhoon.getModelName() + "\n" + typhoon.getMark() + "\n"
                + typhoon.getOrigin() + "\n" + typhoon.getHeight() + "\n" + typhoon.getWeight() +
                "\n" + typhoon.getStrength() + "\n" + typhoon.getArmor());

        typhoon.drift();
        typhoon.move();
        typhoon.scanKaiju();
        typhoon.useVortexCannon();
    }
}