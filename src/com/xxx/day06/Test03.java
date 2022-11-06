package com.xxx.day06;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1，2，3，4，5，按照要求交换索引对应的元素
         * 交换前 1,2,3,4,5
         * 交换后 5,4,3,2,1
         * */
        int[] arr = {1, 2, 3, 4, 5};

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
