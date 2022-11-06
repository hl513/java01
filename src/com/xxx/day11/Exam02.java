package com.xxx.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        /*需求：添加学生对象并遍历
            定义一个集合，添加一些学生对象，并进行遍历
            学生类的属性为：姓名，年龄
        * */
        // 创建集合
        ArrayList<Student> list = new ArrayList<>();
        // 键盘录入学生的信息并添加到集合中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            // 创建学生对象
            Student  student = new Student();
            System.out.println("请输入学生的姓名:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            int age = sc.nextInt();
            // 把name和age赋值给学生对象
            student.setAge(age);
            student.setName(name);

            // 把学生对象添加到集合当中
            list.add(student);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
