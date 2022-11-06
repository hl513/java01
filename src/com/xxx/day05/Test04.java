package com.xxx.day05;

import java.util.Random;
import java.util.Scanner;

// 获取随机数
public class Test04 {
    public static void main(String[] args) {
        // 创建对象
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // 括号内为随机数的范围
        // 这个范围从0开始，到这个数-1结束
        int number = random.nextInt(10);
        System.out.println(number);

        // while循环用于不知道循环次数
        while(true){
            System.out.println("请输入你要猜的数字:");
            int guessNumber = sc.nextInt();
            if (guessNumber>number){
                System.out.println("大了");
            }else if(guessNumber<number){
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }
    }
}
