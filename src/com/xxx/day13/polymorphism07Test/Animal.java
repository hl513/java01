package com.xxx.day13.polymorphism07Test;

public class Animal {
    private String color;
    private int age;

    public Animal() {
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{color = " + color + ", age = " + age + "}";
    }

    // 吃东西的行为 eat()方法
    public void eat(String something){
        System.out.println("动物吃的东西:"+something);
    }
}
