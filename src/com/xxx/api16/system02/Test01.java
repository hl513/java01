package com.xxx.api16.system02;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        // exit()  终止当前运行的java虚拟机
        // 0 ：表示当前虚拟机是正常停止
        // 非0 :表示当前虚拟机异常停止
        // System.exit(0);

        // currentTimeMillis() 返回当前系统的时间毫秒值形式
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum = sum + i;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);

        // 拷贝数组
        int [] arr = {14,78,45,78,61,24,24};
        int [] newArr = new int[arr.length];
        System.arraycopy(arr,0,newArr,0,newArr.length);
        System.out.println(Arrays.toString(newArr));


    }
}
