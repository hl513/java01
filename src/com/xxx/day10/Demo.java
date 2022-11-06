package com.xxx.day10;

public class Demo {
    public static void main(String[] args) {
        String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String str1 = "java";
        int count = 0;
        int i = str.indexOf(str1);
        // 当找不到时，会返回 -1，不为 -1，说明还没有结束
        while (i != -1) {
            // 更新str的长度  为找到的子字符串位置 + 字符串的长度
            str = str.substring(str1.length() + i);
            i = str.indexOf(str1);
            count++;
        }
        System.out.println(count);
    }
}