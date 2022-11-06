package com.xxx.day03;

// 其他运算符
public class Arithmeticoperator06 {
    public static void main(String[] args) {
        /*
         *   &   逻辑与  0为false  1为true
         *   |   逻辑或  0为false  1为true
         *   <<  左移    向左移动，低位补0
         *   >>  右移    向右移动，高位补0或1  原来是正数补0，是负数补1
         *   >>>  无符号右移    向右移动，高位补0
         **/
        // 需要转换成 补码的形式再进行计算
        int a = 200;
        int b = 10;
        System.out.println(a & b); // 8

        System.out.println(a | b); // 202

        // 左移 左移一位就是 * 2
        int i = 200;
        System.out.println(a << 2); // 800

        // 右移 右移一位就是 /2
        System.out.println(a >> 2); // 50

        int j = 200;
        System.out.println(j >>> 2); // 50
    }
}
