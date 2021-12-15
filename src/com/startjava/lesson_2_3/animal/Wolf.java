package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age!");
        } else {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Goes");
    }

    public void sit() {
        System.out.println("Sits");
    }

    public void run() {
        System.out.println("Runs");
    }

    public void howl() {
        System.out.println("Howling");
    }

    public void hunt() {
        System.out.println("Hunting");
    }
}
