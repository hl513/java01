package com.xxx.day15;

public class InterDetail {
    public static void main(String[] args) {

        /*
        * 内部类
        *   在一个类的里面，再定义一个类
        *       例如；在A类的内部定义 B类，B类就被称为内部类
        *   内部类表示的事物是外部类的一部分
        *   内部类单独出现没有任何意义
        *
        *   内部类的访问特点：
        *       内部类可以直接访问外部类的成员，包括私有
        *       外部类要访问内部类的成员，必须创建对象
        *
        *   成员内部类
        *       写在成员位置的，属于外部类的成员
        *
        *   获取成员内部类对象
        *       方式一：在外部类中编写方法，对外提供内部类的对象 （适用于 当成员内部类被private修饰时）
        *       方式二：直接创建格式： 外部类名.内部类名 对象名 = 外部类对象.内部类对象; (被非私有修饰时)
        *   编写成员内部类的注意点：
        *       1、成员内部类可以被一些修饰符所修饰，比如 private,默认,protected,public,static等
        *       2、在成员内部类里面 JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量
        *   访问外部类的成员变量
        *       Outer.this.变量名
        * */

        Car car = new Car();
        car.carName="宾利";
        car.carAge=1;
        car.carColor="粉色";

        car.show();

    }
}
