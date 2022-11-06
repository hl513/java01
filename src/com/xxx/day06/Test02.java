package com.xxx.day06;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        /*
         * 需求：生成10个1-100之间的随机数存入数组
         * 1、求出所有数据的和
         * 2、求所有数据的平均值
         * 3、统计有多少个数据并平均值小
         * */

        Random r = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = r.nextInt(100);
        }

        double sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + sum;
        }

        // 求所有数据的平均数
        double avg = sum / (arr.length - 1);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }

        System.out.printf("平均数%.2f:\n", avg);

        // 比平均数小的个数
        System.out.println("比平均数小的个数:" + count);

        // 求所有数据的和
        System.out.println("所有数据的和" + sum);
        System.out.println(Arrays.toString(arr));
    }
}
