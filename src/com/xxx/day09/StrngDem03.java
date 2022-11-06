package com.xxx.day09;

import java.util.Scanner;

public class StrngDem03 {
    public static void main(String[] args) {
        // 1、创建两个字符串对象
        String s1 =new String("abc");
        String s2 ="abc";

        // 2、==号比较
        /*
          基本数据类型：比的是数据值
          引用数据类型：比的是地址值
        * */
        System.out.println(s1 == s2);

        // 3、比较字符串对象中的内容是否相等
        System.out.println(s1.equals(s2));

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(str.equals(s2));

        // 结论：以后只要想比较字符串的内容，就必须用到String里面的方法

    }
}
