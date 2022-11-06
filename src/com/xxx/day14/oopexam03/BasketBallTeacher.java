package com.xxx.day14.oopexam03;

public class BasketBallTeacher extends Coach{
    @Override
    public void teach() {
        System.out.println("蓝球教练教学生打篮球");
    }

    public BasketBallTeacher() {
    }

    public BasketBallTeacher(String name, int age) {
        super(name, age);
    }
}
