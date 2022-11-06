package com.xxx.day13.polymorphism05;

public class Tes {
    public static void main(String[] args) {
        /*
        * 多态调用成员的特点：
        *   调用成员变量：编译看左边，运行也看左边
        *   调用成员方法：编译看左边，运行看右边
        *
        * 成员变量：在子类的对象中，会把父类的成员变量也继承下的 父:name 子:name4
        * 成员方法：如果子类对方法进行了重写，那么在虚方法表中是把父类的方法进行覆盖的
        * */
        // 创建对象（多态方式）
        // Fu f = new Zi()
        Animal a = new Dog();
        // 调用成员变量 编译看左边，运行也看左边
        System.out.println(a.name);  // 动物
        // 调用成员方法：编译看左边，运行看右边
        a.show();  // Dog……show方法

        Animal b = new Cat();
        // 方法调用：编译看左边，运行看右边
        System.out.println(b.name);  // 动物
        // 调用成员方法：编译看左边，运行看右边
        b.show();  // Cat……show方法
    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal……show方法");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println(name+"Dog……show方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println(name+"Cat……show方法");
    }
}