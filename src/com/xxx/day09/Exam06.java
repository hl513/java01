package com.xxx.day09;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        /*金额转换
         *   2135-->转换为大写
         *   壹拾贰亿叁仟肆佰伍拾陆万柒仟捌佰玖拾元
         * */

        // 1、键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额:");
        int money;
        while (true) {
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效,请重新输入");
            }
        }

        // 定义一个变量用来表示钱的大写
        String moneyStr = "";

        // 2、得到money里面的每一位数字
        while (true) {
            // 从右往左获取 个位
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            // 将转换之后的大写拼接到moneyStr当中
            moneyStr = capitalNumber + moneyStr;
            // 去掉刚刚获取的数据
            money = money / 10;

            // 如果数字上的每一位全部获取到了，那么money记录就是0，此时跳出循环
            if (money == 0) {
                break;
            }
        }

        // 3、在前面补零，补足七位
        int count = 7 - moneyStr.length(); // 4
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        // 4、插入单位   壹拾贰亿叁仟肆佰伍拾陆万柒仟捌佰玖拾元
        // 定义一个数组表示单位
        String result = "";
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        // 遍历 moneyStr 依次得到 零 零 零 贰 壹 叁 伍
        // 然后将arr的单位插进去
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            // 把大写数字和单位拼接到result中
            result = result + c + arr[i];
        }

        // 5、打印最终结果
        System.out.println(result);

    }

    // 定义一个方法把数字转换成大写的中文  壹拾贰亿叁仟肆佰伍拾陆万柒仟捌佰玖拾元
    public static String getCapitalNumber(int number) {
        // 定义数组，让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "柒", "玖"};
        // 返回结果
        return arr[number];
    }
}
