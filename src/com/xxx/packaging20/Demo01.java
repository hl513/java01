package com.xxx.packaging20;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        /*
         *键盘录入一个1~100之间的整数，并添加到集合中
         * 直到集合中所有数据超过200为止
         * */

        // 1、创建一个集合，用来添加数据
        ArrayList<Integer> list = new ArrayList<>();
        // 2、键盘录入数据添加到集合当中
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数：");
            String line = sc.nextLine();
            int parseInt = Integer.parseInt(line);
            // 先把异常数据进行过滤
            if (parseInt > 100 || parseInt < 1) {
                System.out.println("当前数字不在1~100的范围内，请重新输入");
                continue;
            }
            // 添加到集合当中
            // 在添加数据的时候触发了自动装箱
            list.add(parseInt);

            // 统计集合中所有的数据和
            int sum  =getSum(list);
            // 对sum进行判断
            if (sum > 200){
                System.out.println("当前数据已经达到200");
                break;
            }
        }

    }

    // 统计集合中的数据和
    private static int getSum(ArrayList<Integer> list) {
        int sum  =0;
        for (int i = 0; i < list.size(); i++) {
            // i 索引
            sum = sum + list.get(i);
        }
        return sum;
    }

}
