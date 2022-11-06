package com.xxx.day07;

import java.util.Arrays;

public class ExamPlus06 {
    public static void main(String[] args) {
        /*需求
         *   把整数上的每一位都添加到数组当中
         * */
        // 1、计算出数组的长度
        int number = 12345;
        // 定义一个变量临时记录number的值，就是为了第三步的时候再次使用
        int temp  = number;
        int count = 0;
        while (number != 0) {
            // 每一次循环就去掉右边的一个数字
            number = number / 10;
            count++;
        }
        int[] arr = new int[count];
        // 把整数上的每一位都添加到数组当中
        int index = arr.length-1;
        while(temp != 0){
            // 获取temp里面的每一位数字 % 10  12345%10 = 1234 余 5
            int ge = temp % 10;
            // 再去掉右边的那位数字  12345 / 10 = 1234
            temp = temp / 10;
            // 把当前获取到的个位添加到数组当中  arr[0] = 1 arr[1] = 2 arr[2] = 3 arr[3] = 4 arr[4] = 5
            arr[index] = ge;
            index--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
