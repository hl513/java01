package com.xxx.day03;

// 取模
public class Arithmeticoperator02 {
    public static void main(String[] args) {
        // 取模 实际上是做除法运算，只不过得到的是余数而已
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1

        // 用取模来判断 A是否可以被B整除
        // A % B 10 % 3
        // 可以用来判断A是否为偶数
        // A % 2 ==0
    }
}
