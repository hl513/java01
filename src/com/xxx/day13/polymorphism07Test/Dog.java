package com.xxx.day13.polymorphism07Test;

public class Dog extends Animal{

    // 空参构造
    public Dog() {
    }

    // 带参构造
    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"的狗两只前腿死死的抱着"+something+"猛吃");
    }

    public void lookHome(){
        System.out.println("狗会看家");
    }
}
