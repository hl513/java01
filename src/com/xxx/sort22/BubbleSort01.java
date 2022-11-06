package com.xxx.sort22;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        /*
         * 冒泡排序 ： 3 5 2 1 4
         *      1、相邻的数据两两比较，小的放前面，大的放后面
         *      2、第一轮循环结束，最大值已经找到，在数组的最右边
         *              3 2 1 4 5
         *      3、第二轮循环只要在剩余的元素找最大值就可以了
         *              2 1 3 4 5
         *      4、第二轮循环结束，次大值已经确定，第三轮循环继续在剩余数据中循环
         *              1 2 3 4 5
         *
         * */
        int[] arr = {3, 5, 2, 1, 4};
        int[] sort = getBulleSort(arr);
        System.out.println(Arrays.toString(sort));

    }

    // 冒泡排序从小到大进行排序
    public static int[] getBulleSort(int [] arr){
        // 外循环：表示我要执行多少轮，如果有n个数据，那么执行 n-1 轮
        for (int i = 0; i < arr.length; i++) {
            // 内循环：每一轮中我如何比较数据并找到当前的最大值
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                }
            }
        }
        return arr;
    }
}
