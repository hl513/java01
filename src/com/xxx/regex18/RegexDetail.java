package com.xxx.regex18;

public class RegexDetail {
    /*
    * 正则表达式的作用：
    *   1、校验字符串是否满足规则
    *   2、在一段文本中查找满足要求的内容
    *
    * 字符类
    * [abc]   只能是a,b,c
    * [^abc]  除了a,b,c之外的任何字符
    * [a-zA-Z]  a到z,A到Z
    * [a-d[m-p]]  a到d,或m到p
    * [a-z && [def]]  a-z和def的交集  为 d e f
    * [a-z && [^bc]] a-z和非bc的交接
    * [a-z&&[^m-p] a到z和除了 m到p的交集
    *
    *
    * 任何字符
    * \d  一个数字 [0-9]
    * \D   非数字 [^0-9]
    * \s    一个空白字符  [\t\n\xOB\f\r]
    * \S    非空白符号 [^\s]
    * \w    [a-zA-Z_0-9]  英文，数字，下划线
    * \W    [^\w]  一个非单词字符
    * */

    public static void main(String[] args) {

        // 只能是 a b c
        System.out.println("a".matches("[abc]"));  // true
        System.out.println("z".matches("[abc]"));  // false
        System.out.println("ab".matches("[abc]")); // false
        System.out.println("ab".matches("[abc][abc]")); // true

        // 不能出现a b c
        System.out.println("a".matches("[^abc]"));  // false
        System.out.println("z".matches("[^abc]"));  // true
        System.out.println("zz".matches("[^abc]")); // false
        System.out.println("zz".matches("[^abc][^abc]"));  // true
    }
}
