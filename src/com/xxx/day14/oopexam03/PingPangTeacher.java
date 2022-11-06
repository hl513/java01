package com.xxx.day14.oopexam03;

public class PingPangTeacher extends Coach implements English{
    public PingPangTeacher() {
    }

    public PingPangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教学生");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
