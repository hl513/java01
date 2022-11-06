package com.xxx.day14.oopabstract01;

// 抽象类
public abstract class Person {
    // 抽象方法
    public abstract void work();
    // 抽象类不能实例化
//   Person person = new Person();

    // 有抽象方法的类一定是抽象类，但抽象类中的不一定有抽象方法
    public void sleep(){
        System.out.println("睡觉");
    }

}
