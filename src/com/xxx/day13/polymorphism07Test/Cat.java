package com.xxx.day13.polymorphism07Test;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"的猫眯着眼睛侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫会抓老鼠");
    }
}
