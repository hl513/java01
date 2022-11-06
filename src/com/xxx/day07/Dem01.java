package com.xxx.day07;

public class Dem01 {
    public static void main(String[] args) {
        /*需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的*/
        int [] arr={14,6,84,78,95,4,74,4,74};
        arrFor(arr);
    }

    public static void arrFor(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
