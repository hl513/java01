package com.xxx.day07;

public class Dem03 {
    public static void main(String[] args) {
        /*定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处*/
        int[] arr = {548, 87, 58, 47, 64, 41, 25, 78, 98};
        int value = getValue(arr, 98);
        System.out.println(value);

    }

    public static int getValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                value = arr[i];
                break;
            }
        }
        return value;
    }

}
