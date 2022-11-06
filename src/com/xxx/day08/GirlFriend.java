package com.xxx.day08;

public class GirlFriend {

    private int age;
    private String name;
    private String gender;

//    alt + insert 提供set和get方法
    // get方法 ：对外提供成员变量的值
    // set方法: 给成员变量赋值

    /*
    * 1、private关键字是一个权限修饰符
    * 2、可以修饰成员变量和成员方法
    * 3、被private修饰的成员 只能在本类中才能访问
    * 4、针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
    * 5、提供 setXxx(参数)方法，用于给成员变量赋值，方法用public修饰
    * 6、提供 getXxx()方法，用于获取成员变量的值，方法用public修饰
    * */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            // 这里的this指向的是成员变量
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
