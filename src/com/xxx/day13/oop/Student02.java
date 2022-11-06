package com.xxx.day13.oop;

public class Student02 extends Person {

    public Student02() {
        // 子类构造方法中隐藏的super()去访问父类的无参构造方法
        // 写在第一行
        super();
        System.out.println("子类的五参构造方法");
    }

    public Student02(String name, int age) {
       super(name,age);
    }
}
