package com.xxx.day03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        // 比较两只老虎的体重是否相同
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = sc.nextInt();

        String result = weight1 == weight2 ? "相同" : "不相同";
        System.out.println(result);
    }
}
