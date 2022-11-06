package com.xxx.regex18;

public class RegexDem02 {
    public static void main(String[] args) {

        /*
        * 需求：
        *   请编写正则表达式验证用户输入的手机号码是否满足要求
        *   请编写正则表达式验证用户输入的邮箱号码是否满足要求
        *   请编写正则表达式验证用户输入的电话号码是否满足要求
        * */

        // 分成三个部分
        // 第一部分 ： 1 表示手机号码只能以 1开头
        // 第二部分 ： [3-9] 表示手机号码第二位只能时在3-9之间的
        // 第三部分： \\d{9}  表示任意数字可以出现9次，也只能出现9次
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("15345678984".matches(regex1));

        // 固定电话号码
        // 020-2324242 02122442  027-47424 0712-324234
        // 区号：0\\d{2,3}
        // -  : 出现0次或者一次 ?表示0次或者一次
        // 号码
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));



        // 邮箱号码   3232323@qq.com   zhangsan@itcast.cnn
        // @的左边：可以是数字，字母 \\w+ 表示任意的的单词
        // @只能出现一次
        // 点的左边  可以是字母，可以是数字 [\\w&&[^_]]{2,6}
        // . \\.
        String regex3 ="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));

        String regex4 ="/^\\d{15,17}$/";
        System.out.println("522426200002157869".matches(regex4));
    }
}
