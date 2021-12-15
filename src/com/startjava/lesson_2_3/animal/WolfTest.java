package com.startjava.lesson_2_3.animal;

/**
 * Модифицируйте класс Wolf
 * у всех полей класса напишите модификатор доступа private
 * а у его методов — public
 * для доступа к полям создайте геттеры и сеттеры
 * в сеттере поля age реализуйте проверку: если возраст волка > 8 лет,
 * то выведите сообщение "Некорректный возраст". В противном случае сохраните
 * значение в поле
 * Модифицируйте класс WolfTest
 * с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
 * считайте эти значения из полей с помощью геттеров и отобразите в консоли
 */
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("Mail");
        wolf.setName("Jack");
        wolf.setWeight(25);
        wolf.setAge(15);
        wolf.setColor("Gray");

        System.out.println("Sex - " + wolf.getSex());
        System.out.println("Name - " + wolf.getName());
        System.out.println("Weight - " + wolf.getWeight());
        System.out.println("Age - " + wolf.getAge());
        System.out.println("Color - " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}