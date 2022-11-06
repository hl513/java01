package com.xxx.day13.extends02;

public class Student {
    String name;
    int age;
    String school;

    // 需求：
    // 如果学校名字没有赋值，默认为  南开大学

    public Student(){
        // 表示调用本类其他构造方法
        // 细节：虚拟机就不会再添加super()
        this(null,0,"南开大学");
    }
    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void show(){
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(name+","+age+","+school);
    }
}
