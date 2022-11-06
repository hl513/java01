package com.xxx.day14.oopinterface02;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("够吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗会狗刨");
    }
}
