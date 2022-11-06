package com.xxx.day11;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Exam01{
    public static void main(String[] args) {
        /*需求
        *   定义一个集合，添加字符串，并进行遍历
        *   遍历格式参照 [元素1、元素2、元素3]
        * */
        ArrayList<String> list = new ArrayList<>();
        list.add("元素1");
        list.add("元素2");
        list.add("元素3");

        StringJoiner joiner = new StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).toString();
            joiner.add(str);
        }
        System.out.println(joiner);
    }
}
