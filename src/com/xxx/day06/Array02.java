package com.xxx.day06;

// 遍历方式
public class Array02 {
    public static void main(String[] args) {

        // 定义数组
        int [] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // for each
        /* 这里的变量下标是从1开始的
        * for(接受的变量名:数组名){ }
        * */
        for (int i:arr) {
            System.out.println(arr[i-1]);
        }
    }
}
