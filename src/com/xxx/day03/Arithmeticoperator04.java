package com.xxx.day03;

// 逻辑运算符
public class Arithmeticoperator04 {
    public static void main(String[] args) {
        /*
        &     逻辑与   并且，两边都为真，结果才为真
        |     逻辑或   或者，两边都为假，结果才是假
        ^     逻辑异或  相同为false，不同为true
        !     逻辑非   取反
         */
        // & 并且，两边都为真，结果才为真
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & true);

        System.out.println("********************");

        // | 或者  两边都为假，结果才为假
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);

        System.out.println("********************");

        // ^ 异或 相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);

        System.out.println();

        // 短路逻辑运算符具有短路效果
        // 简单理解： 当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean resulet = ++a < 5 && ++b < 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(resulet);
    }
}
