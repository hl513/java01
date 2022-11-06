package com.xxx.day13.extends02;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age=15;
        stu.name="zhansgan";

        stu.show();

        // 可以把对象在内存中的结构打印出来
//        ClassLayout layout = ClassLayout.parseInstance(stu);
//        System.out.println(layout.toPrintable);
    }
}
