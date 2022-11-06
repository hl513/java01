package com.xxx.day05;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /*键盘录入一个正整数x，判断该整数是否为一个质数*/
        // 质数：只能被 1 和 它本身整除 7 = 1 * 7

        // 1、键盘录入一个正整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();

        // 2、判断
        /*写一个循环，从2开始判断，一直判断到number-1为止
         *  看在这个范围内，有没有其他数字可以被number整除
         * */
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + "不是一个质数");
                break;
            }
        }
    }
}
