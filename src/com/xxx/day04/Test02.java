package com.xxx.day04;

public class Test02 {
    public static void main(String[] args) {
        /*
         * 给出两个整数，被除数和除数（都是正数，且不超过int的范围）
         * 将两数相除，要求不使用乘法、除法和 % 运算符
         * 得到商 和 余数
         * */
        // 1、定义变量记录被除数
        int dividend = 123;
        // 2、定义变量记录除数
        int divisor = 10;
        // 定义一个变量用来统计相减了多少次
        int count = 0;
        // 3、循环 不断的用 被除数 - 除数
        // 只要被除数 大于等于 除数，那么就一直循环
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        // 当前循环结束之后 dividend变量记录的就是余数
        System.out.println("余数为:" + dividend);
        System.out.println("商：" + count);

    }
}
