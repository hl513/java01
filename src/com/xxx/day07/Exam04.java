package com.xxx.day07;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        /*
         * 需求
         *   在唱歌比赛，有6位评委给选手打分，分数范围是【0-100】之间的整数。选手的最后得分为：去掉最高分、最低分后的4
         * 个评委的平均分，请完成上述过程并计算出选手的得分
         * */

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的评分:");
            arr[i] = sc.nextInt();
        }

        // 冒泡排序，先讲数组有序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        double sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum = sum + arr[i];
            count++;
        }
        System.out.println(sum / count);
    }
}
