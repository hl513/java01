package com.xxx.day03;

// 自增 自减
public class Arithmeticoperator03 {
    public static void main(String[] args) {
        int x = 10;
        // 后++，先用后加
        // 先把 x 变量中的值拿出来用，赋值给y，然后再进行自增
        // 赋值给y的值是自增前
        int y = x++; // x=11,y=10;

        // 先++,先加后用
        int z = ++x; // z=12
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);
    }
}
