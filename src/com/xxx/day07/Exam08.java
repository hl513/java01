package com.xxx.day07;

import java.util.Random;

public class Exam08 {
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
        // 2、定义新数组用于存储抽奖的结果
        int [] newArr = new int[arr.length];
        // 3、抽奖 有五个奖项
        Random r = new Random();
        for (int i = 0; i < 5;) {
            // 生成随机索引
            int randomIndex = r.nextInt(arr.length);
            // 获取奖项
            int prize = arr[randomIndex];
            boolean flag = contain(newArr, prize);
            // 判断当前的奖项是否存在，如果存在则重新抽取，如果不存在就表示是有效奖项
            if (!flag){
                // 不存在
                // 把当前抽取到的奖项添加到 newArr中
                newArr[i] = prize;
                // 添加完毕后，移动索引
                i++;
            }
        }

        // 遍历newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    // 判断奖项在数组中是否存在
    public static boolean contain(int [] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==prize){
                return true;
            }
        }
        return false;
    }
}
