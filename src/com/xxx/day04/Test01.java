package com.xxx.day04;

import java.util.Scanner;

@SuppressWarnings("/")
public class Test01 {
    public static void main(String[] args) {
        /*
         * 给你一个整数，如果x是一个回文数，打印true，否则，返回false
         * 回文数：从左向右和从右向左读是一样的
         * 121是 123不是   输入的数是负数的话不能解决
         * 思路：
         *      定义一个新的变量，用来保存我们每次将原来的数进行取出  ，然后将值进行乘法之后 赋给我们定义的变量
         * */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 定义一个临时变量，用于记录原来的值
        int temp = a;
        int num = 0;

        // 只要我们初始值不为0，则一直进行循环
        while (a != 0) {
            // 1、从右往左获取每一位数字
            int i = a % 10;
            // 2、修改一下a记录的值
            a = a / 10; // 1234 / 10  123.4

            // 把当前获取到的数字拼接到最右边
            num = num * 10 + i; // 4  43 432 4321
        }
        // 比较
        if (num == temp) {
            System.out.println(num + "是回文数");
        } else {
            System.out.println(num + "不是回文数");
        }
    }
}
