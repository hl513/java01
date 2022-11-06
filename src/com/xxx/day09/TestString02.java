package com.xxx.day09;

public class TestString02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        // 比较的时地址值
        System.out.println(s1 == s2);

        String s3 = new String("abc");  // 记录堆里面的地址值
        String s4 = "abc";  // 记录串池中的地址值
        System.out.println(s3 == s4);
    }
}
