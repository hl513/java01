package com.xxx.day08;

public class Construction {

    private int age;
    private String name;

    /*
     * 构造方法：
     *       构造方法也叫构造器、构造函数
     *     作用：在创建对象的时候给成员变量进行赋值的
     *
     * 格式：
     *       修饰符 类名（参数）{
     *           方法体;
     *   }
     *
     * 执行时机：
     *       1、创建对象的时候由虚拟机调用，不能手动调用构造方法
     *       2、每创建一次对象，就会调用一次构造方法
     *
     * 特点：
     *   1、方法名与类名相同，大小写也要一致
     *   2、没有返回值类型，连void都没有
     *   3、没有具体的返回值 （不能由return带回结果数据）
     *
     * 如果我们没有自己写任何的构造方法，那么虚拟机给我们加一个空参构造方法
     *
     * */

    // 无参构造
    public Construction() {
        // 可以给成员变量赋初值
        System.out.println("无参的构造方法……");
    }

    // 有参构造方法
    public Construction(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println(age);
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
