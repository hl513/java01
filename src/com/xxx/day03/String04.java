package com.xxx.day03;

@SuppressWarnings("all")
public class String04 {
    public static void main(String[] args) {
        // 从左到右进行拼接
        System.out.println(3.7 + "abc");  // 3.7abc
        System.out.println("abc" + true); // abctrue
        System.out.println(1 + 9 + "年");  // 10年
        System.out.println("中" + "abc" + true);
    }
}
