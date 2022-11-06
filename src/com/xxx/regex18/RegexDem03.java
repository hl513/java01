package com.xxx.regex18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDem03 {
    public static void main(String[] args) {
        // 爬取 JavaXX
        String str="Java11和Java8是长期支持的，下一个版本是Java17,让我们期待Java的发展吧";

        // Pattern: 表示正则表达式
        // Matcher：文本匹配器，用来按照正则表达式的规则去读取字符串，从头开始读取
        // 在大串中去符合匹配规则的子串

        // 1、获取正则表达式的对象
        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        // 2、获取文本匹配器的对象
        // 获取文本匹配器的对象
        // matcher 文本匹配器对象
        // str: 大串
        // pattern： 规则
        Matcher matcher = pattern.matcher(str);
        // 拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        // 如果没有返回false，
        // 如果有的话，返回true,在底层记录子串的起始索引和结束索引+1
        while(matcher.find()){
            // 方法底层会根据find方法记录的索引的进行字符串的截取
            String st = matcher.group();
            System.out.println(st);
        }

    }

}
