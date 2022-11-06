package com.xxx.day03;

public class Test04 {
    public static void main(String[] args) {
        // 需求，一个寺庙住着三个和尚，已他们的身高分别为:150cm、210cm、165cm
        // 用程序获取这三个和尚的最高身高
        int high1 = 150;
        int high2 = 210;
        int high3 = 165;

        int temp = high1 > high2 ? high1 : high2;
        int result = temp > high3 ? temp : high3;
        System.out.println(result);

    }
}
