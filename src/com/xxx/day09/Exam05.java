package com.xxx.day09;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {

        /*
        * 需求：字符串反转
        *       定义一个方法，实现字符串反转
        *       键盘录入一个字符串，调用该方法后，在控制台输出结果
        *       例如 键盘输入 abc，输出结果 cba
        * */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverser = reverser(str);
        System.out.println(reverser);

    }
    // 我要干嘛  字符串的反转
    // 我干这件事情需要什么才能完成  字符串
    // 方法的调用处是否需要继续使用方法的结果  需要

    public static String reverser(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            // i依次表示字符串中的每一个索引
            char charAt = str.charAt(i);
            result = result + charAt;
        }
        return result;
    }

}
