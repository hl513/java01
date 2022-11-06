package com.xxx.day15.outer01;

public class Test {
    public static void main(String[] args) {
        // 我要创建的是谁的对象?
        // 内部类的对象
        //  方式二：直接创建格式： 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        Outer.Inner oi = new Outer().new Inner();

        // 方式一：在外部类中编写方法，对外提供内部类的对象
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInnerStance();

        oi.show();
    }
}
