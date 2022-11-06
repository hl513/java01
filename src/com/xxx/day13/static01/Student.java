package com.xxx.day13.static01;

public class Student {
    // 属性：姓名 年龄 性别
    // 新增：老师的姓名
    private String name;
    private String gender;
    private int age;
    // static表示这个类的所有对象共享这个老师的姓名
    public static String teacherName;


    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 行为
    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name+" ,"+age+","+gender+","+teacherName);
    }

    // this:表示当前方法调用者的地址值
    // 这个this：是由虚拟机赋值的
    public void show1(Student this){
        System.out.println("this:"+this);
        System.out.println(name+" ,"+age+","+","+teacherName);

        // 调用其他方法
        this.show2();
    }

    public void show2(){
        System.out.println("show2");
    }

    public static void method(){
        // 静态方法 不能调用非静态成员变量
//        System.out.println(name);
        System.out.println("静态方法");
    }

}
