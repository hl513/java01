package com.xxx.day07;

import java.util.Arrays;
import java.util.Random;

public class ExamPlus {
    public static void main(String[] args) {
        /*需求
        *   一个大V直播抽奖，奖品是现金红包，分别有 [2,588,888,1000,10000]五个奖金。请使用代码模拟抽奖
        * 打印出每个奖项，奖项的出现顺序要随机且不能重复的。打印效果如下
        *  888被抽出
        *   2被抽出
        *   588被抽出
        *   1000被抽出
        *   10000被抽出
        * */

        // 1、定义数组表示奖池
        int [] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length;i++) {
            // 获取随机索引
            int randomIndex = r.nextInt(arr.length);
            // 拿着i与随机索引上的值进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        // 遍历奖池
        System.out.println(Arrays.toString(arr));
    }
}
