package com.xxx.day07;

public class Exam03 {
    public static void main(String[] args) {

        /*判断101-200之间有多少个素数，并输出所有素数*/
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            // 1、i依次表示循环中的每一个数字
            // 2、继续判断i是否为一个质数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                // j表示2-99之间的每一个数字
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                count++;
            }
        }

    }
}
