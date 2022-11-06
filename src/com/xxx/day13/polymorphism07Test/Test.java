package com.xxx.day13.polymorphism07Test;

public class Test {
    public static void main(String[] args) {
        // 创建对象并调用方法
     /*   Person p = new Person("老王",30);
        Dog dog = new Dog("黑色",2);
        p.keepPet(dog,"骨头");

        Person p1 = new Person("老李",30);
        Cat cat = new Cat("白色",4);
        p1.keepPet(cat,"鱼干");*/

        // 创建饲养员的对象
        Person person = new Person("老王",30);
        Dog dog = new Dog("黑色",2);
        person.keepPet(dog,"骨头");


        Person p2 = new Person("老李",25);
        Cat cat = new Cat("白色", 4);
        p2.keepPet(cat,"鱼干");
    }
}
