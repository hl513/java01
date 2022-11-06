package com.xxx.day07;

public class Test02 {
    public static void main(String[] args) {
        /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法
         * 要求：兼容全整数类型
         * */
        isEquals(12,12);
    }

    public static void isEquals(int a, int b) {
        System.out.println("int");
        System.out.println(a == b);
    }

    public static void isEquals(byte a, byte b) {
        System.out.println("byte");
        System.out.println(a == b);
    }

    public static void isEquals(long a, long b) {
        System.out.println("long");
        System.out.println(a == b);
    }

    public static void isEquals(short a, short b) {
        System.out.println("short");
        System.out.println(a == b);
    }
}
