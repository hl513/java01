package com.xxx.day09;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {
        /*
        需求： 手机号屏蔽
               获取一个完整的手机号，将手机号中间的4位屏蔽起来
               String substring(int beginIndex,int endIndex) 截取
               包头不包尾，包左不包右
               只有返回值才是截取的小串
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNumber = sc.nextLine();

        // 2、截取手机号码前面的三位
        String start = phoneNumber.substring(0, 3);

        // 3、截取手机号码 后4位
        String end = phoneNumber.substring(phoneNumber.length() - 4);

        // 4、拼接
        String result = start + "****" + end;
        System.out.println(result);
    }
}
