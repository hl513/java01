package com.xxx.day10;

import java.util.StringJoiner;

public class StringJoiner02 {
    public static void main(String[] args) {

        int [] arr = {1,2,3};

        /*
        * public StringJoiner(间隔符号)   创建一个StringJoiner对象，指定拼接时的间隔符号
        * public StringJoiner(间隔符号，开始符号，结束符号);  创建一个StringJoiner对象
        *   指定拼接时的间隔符号、开始符号、结束符号
        *
        * public StringJoiner add(添加内容)  添加数据，并返回对象本身
        * public int length()  返回长度
        * public String toString () 返回一个字符串
        * */

        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            joiner.add(arr[i]+"");
        }
        System.out.println(joiner.toString());
    }
}
