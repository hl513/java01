package com.xxx.day03;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，将其拆分为 个位，十位，百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int anInt = sc.nextInt();
        /*
         * 公式总结：
         *  个位: 数值 % 10
         *  十位: 数值 / 10 % 10
         *   百位: 数值 / 100 % 10
         */
        int ge = anInt % 10;
        int shi = anInt / 10 % 10;
        int bai = anInt / 100 % 10;
        System.out.println("个位:" + ge + "，十位:" + shi + ",百位:" + bai);

        // 也可以循环依次求出
        do {
            int temp = anInt % 10;
            System.out.println(temp);
            anInt = anInt / 10;
        } while (anInt != 0);
    }
}
