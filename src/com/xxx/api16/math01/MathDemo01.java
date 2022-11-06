package com.xxx.api16.math01;

public class MathDemo01 {
    public static void main(String[] args) {
        // 获取参数绝对值
        System.out.println(Math.abs(-2147483648));
        // 向上取整
        System.out.println(Math.ceil(12.34));
        // 向下取整
        System.out.println(Math.floor(12.54));
        System.out.println("=====================");

        for (int i = 0; i < 10; i++) {
            // random() 获取0-1之间的随机数
            System.out.println((int)Math.floor(Math.random()*10)+1);
        }
    }
}
