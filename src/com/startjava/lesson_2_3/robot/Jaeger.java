package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, float height,
                  float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

   public String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }
}