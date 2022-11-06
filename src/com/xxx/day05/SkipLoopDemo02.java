package com.xxx.day05;

public class SkipLoopDemo02 {
    public static void main(String[] args) {
        // 跳过某一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // 结束本次循环，继续下次循环
                continue;
            }
            System.out.println("小明在吃第" + i + "个包子");
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // 结束整个循环
                break;
            }
            System.out.println("小红在吃第" + i + "个包子");
        }

        // 逢七必过
        /*从任意一个数字开始报数，当你要报的数字包含7，或者是7的倍数时，要说过，*/
        // 使用程序在控制台打印出 1-100之间的满足逢7必过规则的数据
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
