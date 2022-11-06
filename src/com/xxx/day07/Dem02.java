package com.xxx.day07;

public class Dem02 {
    public static void main(String[] args) {
        /*调用方法求最大值*/
        int [] arr = {14,54,87,78,96,11,54,744,987};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int [] arr){
        // 假设第一个数为最大值
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
