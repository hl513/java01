package com.xxx.packaging20;

import java.util.Scanner;

public class Integer03 {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
//        int i = sc.nextInt();
//        System.out.println(i);
        // 弊端
        // 当使用next,nextInt,nextDouble 在接收数据的时候，遇到 空格、回车、制表符的时候就停止了
        // 键盘录入的是 123 123 那么只能接收到空格前面的数据
        // 以后我们想要接收键盘录入，不管什么类型，统一使用 nextLine
        // 特点：遇到回车才停止
        String str = sc.nextLine();
        int i = Integer.parseInt(str);
        System.out.println(str);
    }
}
