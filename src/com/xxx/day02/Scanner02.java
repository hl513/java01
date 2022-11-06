package com.xxx.day02;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // 创建对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数:");
        // 接受数据
        int i = scanner.nextInt();
        System.out.println(i);
    }
}
