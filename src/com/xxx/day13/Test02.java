package com.xxx.day13;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        // 利用空参的构造创建子类对象
        Son son = new Son();

        // 利用带参构造创建子类对象
        // 子类不能继承父类的带参构造方法
//       Son s2 = new Son("zhansgan",15);

        // 成员变量的继承情况：私有的 能继承 不能用
        System.out.println(son); // com.xxx.day13.Son@4554617c
        son.name="东方不败";
        // son.age = 15;  私有不能赋值，会进行报错
        son.game="开心消消乐";
        System.out.println(son.game);  // 开心消消乐

        // 将对象的地址值 z 以 16进制的形式打印在控制台上
//        System.out.println(Long.toHexString(VM.current().addressOf(son)));

        // 因为内存分析工具需要程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();

    }
}
class Fu{
    String name;
    private int age;
    // 私有的能继承，但不能直接使用
    private String gongFu;

    private int a  = 0x111;
    int b = 0x22;

    public void fuShow1(){
        System.out.println("public-----fushow");
    }

    private void fuShow2(){
        System.out.println("private-----fushow");
    }

    public Fu(){
    }
    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Son extends Fu{
    // 如果一个类中没有构造方法，虚拟机会自动的给你添加一个默认的空参构造

    String game;

    int c = 0x333;

    public void sonShow(){
        System.out.println("public----SonShow");
    }


}