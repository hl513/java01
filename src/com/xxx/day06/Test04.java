package com.xxx.day06;

import java.util.Arrays;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1-5.要求打乱数组中所有数据的顺序*/
     /*   int [] arr = {1,2,3,4,5};
        // 索引范围
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);*/

        int[] arr = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 生成随机数
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 生成一个随机索引,随机数的产生为 数组的长度
            int randomIndex = r.nextInt(arr.length);
            // 拿着随机索引指向的元素 跟 i指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;

        }
        // 当循环结束后，那么数组中所有的数据都已经打乱顺序
        System.out.println(Arrays.toString(arr));

    }
}
