package com.xxx.day09;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {

        /*
         *  需求：
         *   键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字出现的次数
         * */
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int bigCount = 0;
        int samllCount = 0;
        int numberCount = 0;
        int other = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                samllCount++;
            } else if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                bigCount++;
            } else if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                numberCount++;
            }else{
                other++;
            }
        }
        System.out.println("大写字母:"+bigCount);
        System.out.println("小写字母:"+samllCount);
        System.out.println("数字:"+numberCount);
        System.out.println("其余符号:"+other);
    }
}
