package com.xxx.day04;

import java.util.Scanner;

@SuppressWarnings(value = "all")
public class If01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的酒量:");
        int wine = sc.nextInt();
        if (wine>5){
            System.out.println("小伙子，酒量不错");
        }else{
            System.out.println("小趴菜");
        }
    }
}
