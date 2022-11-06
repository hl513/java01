package com.xxx.day04;

@SuppressWarnings("all")
public class While04 {
    public static void main(String[] args) {

        /*
         * 世界最高山峰是珠穆朗玛峰，(8844.43米 = 8844430毫米)
         * 设一张纸足够大，厚度为0.1毫米
         * 请问折叠多少次，可以达到珠穆朗玛峰的高度
         * */
        int weight = 8844430;
        // 每一次折叠都是原纸张的两倍
        double a = 0.1;
        // 用来统计次数
        int count = 0;
        while (a < weight) {
            a = a * 2;
            count++;
        }
        System.out.println(count);
    }
}

