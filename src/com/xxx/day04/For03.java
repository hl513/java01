package com.xxx.day04;

import java.util.Scanner;

@SuppressWarnings("all")
public class For03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次执行断线重连的业务逻辑");
        }

        // 求1-5的和
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        // 求1-100之间的偶数和
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        System.out.println(result);

        // 键盘录入两个数字，表示一个范围，统计这个范围内
        // 既能被3整除，又能被5整除的数有多少个
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始范围:");
        a = sc.nextInt();
        System.out.println("请输入结束范围:");
        b = sc.nextInt();
        int num = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                num++;
            }
        }
        System.out.println("能被3整数，又能被5整除的数有:"+num+"个");

    }
}
