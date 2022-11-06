package com.xxx.day10;

public class Exam04 {
    public static void main(String[] args) {
        /*需求 ：调整字符串
               给定两个字符串 A和B
               A的旋转操作就是将A最做左边的字符移动到最右边
               例如 A=”abcde"  在移动一次以后   "bcdea"
               如果在若干次调整操作之后，A能变成B，那么就返回 true
               如果不能匹配成功，则返回false
        * */

        // 1、定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";

        // 2、旋转字符串
        strA = rotate(strA);

        // 循环旋转并比较
        boolean reuslt = check(strA, strB);
        System.out.println(reuslt);
    }

    // 旋转字符串 把左侧的字符移动到右侧去
    // 形参：旋转前的字符串
    // 返回值：旋转后的字符串
    public static String rotate(String str) {
        // 套路，要修改字符串的内容，用subString进行截取，把左边的字符截取出来拼接到右侧去
        // 2、可以把字符串先变成一个字符数组，然后调整字符数组里面数据，然后再把字符数组变成字符串

        // 获取最左侧的那个字符
        char first = str.charAt(0);
        // 获取剩余的字符
        String end = str.substring(1);
        String result = end + first;
        return result;
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
           strA = rotate(strA);
           if (strA.equals(strB)){
               return true;
           }
        }
        // 所有的情况比较完毕再返回false
        return false;
    }

}
