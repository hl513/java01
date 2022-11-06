package com.xxx.day05;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*键盘录入一个大于等于2的整数x，计算并返回x的平方根，结果只保留整数部分，小数部分将被舍去*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int x = sc.nextInt();

        // 平方根 16的平方根 4
        /*从1开始循环，拿着数字的平方根与原来的数字进行比较
         *  如果小于等于，那么继续往后判断
         * 如果相等，那么当前数字就是平方根
         * 如果大于的，那么前一个数字就是平方根的整数部分
         * */

        // 从1开始循环判断
        for (int i = 1; i <= x; i++) {
            // 用 i*i == number
            if (i * i == x) {
                System.out.println(i + "就是" + x + "的平方根");
                // 一旦找到了，循环就可以停止，后面的数字就不需要再找了，提高代码的运行效率
                break;
            } else if (i * i > x) {
                System.out.println((i - 1) + "就是" + x + "的平方根");
                break;
            }
        }

    }
}
