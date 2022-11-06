package com.xxx.day07;

import java.util.Arrays;

public class CopyArr01 {
    public static void main(String[] args) {
        /*需求：定义一个方法 copyOfRange
        功能：将数组 arr 中从索引 from(包含from)开始 到索引 to 结束（不包含） 的元素复制到新数组中
        将新数组返回
         */

        // 定义原始数组
        int[] oldArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 调用方法拷贝数据
        int[] ints = copyOfRange(oldArr, 3, 7);
        System.out.println(Arrays.toString(ints));
    }


    // 将数组 arr 中从索引from开始，到索引to结束的元素复制到新数组中
    public static int[] copyOfRange(int[] arr, int from, int to) {
        // 1、定义数组
        int[] newArr = new int[to - from];

        // 2、把原始数组 arr中的from 到 to上对应的元素，直接拷贝到newArr中
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
        }
        return newArr;
    }
}
