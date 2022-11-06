package com.xxx.search21;

import java.util.ArrayList;

public class BasicSearchDem02 {
    public static void main(String[] args) {
        // 基本查找
        // 核心：从 0 索引开始挨个往后查找
        // 需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        // 要求：不需要考虑数组中元素是否重复
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 81};
        int number = 81;
        System.out.println(basicSearch02(arr, number));

        System.out.println(basicSearch03(arr, number));
    }

    // 不考虑数组中是否有重复元素
    public static int basicSearch02(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // 需要考虑数组中有重复元素
    // 心得：如果我们要返回多个数据，可以把这些数据放到数组或集合中
    public static ArrayList<Integer> basicSearch03(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }

}
