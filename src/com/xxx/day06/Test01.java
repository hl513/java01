package com.xxx.day06;

public class Test01 {
    public static void main(String[] args) {
        // 求最大值
        int[] arr = {14, 25, 365, 45, 48};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
