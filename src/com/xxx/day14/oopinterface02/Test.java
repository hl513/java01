package com.xxx.day14.oopinterface02;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Dog dog = new Dog("小花",5);
        System.out.println(dog.getAge()+","+dog.getName());
        dog.eat();
        dog.swim();

        Frog frog = new Frog("小青",2);
        System.out.println(frog.getAge()+","+frog.getName());
        frog.eat();
        frog.swim();

        Rabbit rabbit = new Rabbit("小红",3);
        System.out.println(rabbit.getAge()+","+rabbit.getName());
        rabbit.eat();

    }
}
