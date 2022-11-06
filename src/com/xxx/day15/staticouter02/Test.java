package com.xxx.day15.staticouter02;

public class Test {
    public static void main(String[] args) {

        /*
       对象的创建：  外部类名.内部类名 对象名  = new 外部类名.内部类名();
            调用非静态方法的格式：
                先创建对象，用对象调用

            调用静态方法的格式：
                外部类名.内部类名.方法名()
         */

        // 创建静态内部类的对象
        // 只要是静态的东西，都可以用 类名点直接获取
            Outer.Inner oi = new Outer.Inner();
            oi.show1();
            // 静态方法
            Outer.Inner.show2();
    }
}
