package com.xxx.day13.static01;

/*
* static 表示静态，是java中的一个修饰符，可以修饰成员方法，成员变量
*   静态变量是随着类的加载而加载的，优先于对象出现的
*       被static修饰的成员变量，叫做成员变量
*           特点：被该类所有对象共享
*           调用方式： 类名调用（推荐），对象名调用
*       被static修饰的成员方法，叫做静态方法
*           特点：多用于测试类和工具类中
*           调用方式：类名调用（推荐） 对象名调用
* */
public class StudentTest {
    public static void main(String[] args) {
        /*
        * static的注意事项：
        *       静态方法中，只能访问静态
        *       非静态方法可以访问所有
        *       静态方法中没有this关键字
        * */

        // 可以用 对象名.属性名 = "xxx"
        // 也可以用 类名.属性名 = "xxx"
        Student.teacherName = "阿伟老师";
        // 1、创建一个学生对象
        Student s1 = new Student();
        System.out.println("s1:"+s1);
        s1.setName("张三");
        s1.setAge(20);
        s1.setGender("男");

        s1.show1();

        // 2、创建第二个学生对象
        // 快捷键：alt + 鼠标滚轮，可以多选
        Student s2 = new Student();
        System.out.println("s2:"+s2);
        s2.setName("李四");
        s2.setAge(25);
        s2.setGender("女");

        s2.show1();

    }
}
