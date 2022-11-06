package com.xxx.day06;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        // 数组：是一种容器，可以用来存储同种数据类型的多个值
        // 数组容器在存储数据的时候，需要结合隐士转换考虑
        int[] arr = {14, 25, 45, 65, 9, 98, 78, 41, 54};

        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

