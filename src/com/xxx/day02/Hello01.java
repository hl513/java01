package com.xxx.day02;

public class Hello01 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 97, 88, 45, 100, 598, 78, 999};
        int mAax = getMAax(arr);
        System.out.println(mAax);
    }

    // 获取数组中的最大值
    public static int getMAax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
