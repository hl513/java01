package com.xxx.day09;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        /*需求
        *   键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        * */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // public char charAt(int index) 根据索引返回字符
        for (int i = 0; i < str.length(); i++) {
            // i 依次表示字符串的每一个索引
            char charAt = str.charAt(i);
            System.out.print(charAt+" ");
        }
    }
}
