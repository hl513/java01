package com.xxx.day10;

import java.util.Scanner;
import java.util.StringJoiner;

public class Exam03 {
    public static void main(String[] args) {
        /*转换罗马数字
         *   要求1：长度为小于等于9
         *   要求2：只能是数字
         * 将内容转换为罗马数字
         * I ,II ,III,IV ,V ,VI,VII ,VIII ,IX,X。
         * 注意点：罗马数字罗马是没有0的
         * 如果键盘录入的数字包含0 ，可以变成 " "(长度为0的字符串)
         * */

        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入字符串");
            str = sc.nextLine();

            // 2、校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则，请重新输入");
            }
        }

        //   * 将内容转换为罗马数字
        //  I ,II ,III,IV ,V ,VI,VII ,VIII ,IX,X。
        // 查表法
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String result = changeLuoMa(number);
            joiner.add(result);
        }
        System.out.println(joiner);

    }

    public static String changeLuoMa(int number) {
        // 定义一个数组，让索引与罗马数字产生一个对应关系     I ,II ,III,IV ,V ,VI,VII ,VIII ,IX,X。
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return arr[number];
    }

    public static boolean checkStr(String str) {
        // 1、要求长度小于等于9
        if (str.length() >= 9) {
            return false;
        }
        // 要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        // 只有当字符串里面所有的字符全都判断完毕，我们才能认为当前的字符是符合规则的
        return true;
    }

}
