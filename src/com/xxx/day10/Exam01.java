package com.xxx.day10;

import java.util.Scanner;

public class Exam01 {
    // 使用StringBuilder的场景: 1、字符串的拼接  2、字符串的反转
    public static void main(String[] args) {
        /*需求：对称字符串
        *   键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        *   对称字符串：123321
        *   非对称字符串 123123
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();

        // 反转键盘录入的字符串
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.reverse();
        String toString = builder.toString();
        if (toString.equals(str)){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
    }
}
