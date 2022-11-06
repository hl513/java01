package com.xxx.day15.localInner03;

public class Outer {
    int b = 20;

    public void show() {
        int a = 10;
        // 局部内部类
        class Inner {
            String name;
            int age;

            public void method1(){
                System.out.println(a); // 10
                System.out.println(b); // 20
                System.out.println("局部内部类中的method1方法");
            }
            public void method2(){
                System.out.println("局部内部类中的经他method2方法");
            }

        }

        // 创建局部内部类的对象
        Inner inner = new Inner();
        System.out.println(inner.age); // 0
        System.out.println(inner.name); // null
        inner.method1();
        inner.method2();
    }

}
