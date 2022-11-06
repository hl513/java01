package com.xxx.day13.polymorphism04;

public class Test {
    public static void main(String[] args) {
        // 创建三个对象，并调用register方法
        Student student = new Student();
        student.setName("zahnsgan");
        student.setAge(18);

        Teacher teacher = new Teacher();
        teacher.setAge(28);
        teacher.setName("罗翔");

        Administrator administrator = new Administrator();
        administrator.setAge(35);
        administrator.setName("管理员");

        register(student);
        register(teacher);
        register(administrator);

    }

    // 这个方法既能接收老师，又能接收学生，还能接收管理员
    // 只能把参数写成这三个类型的父类
    public static void register(Person person){
        person.show();
    }
}

