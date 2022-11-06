package com.xxx.day07;

public class Exam07 {
    public static void main(String[] args) {

        int number = 8346;
        // 用来临时存储原来的密文
        int temp = number;
        // 将number的个数统计出来
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        // System.out.println(count); // 用来验证个数是否满足
        int[] arr = new int[count];

        // 将数字存到数组中
        for (int i = arr.length - 1; i >= 0; i--) {
            int value = temp % 10; // 8346 % 10 = 6
            temp = temp / 10;
            arr[i] = value;
        }

        // 由于加密是通过对10取余的方式进行获取的
        // 所以在解密的时候就需要判断 0~4之间+110，5~9数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        // 每一位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
    }
}
