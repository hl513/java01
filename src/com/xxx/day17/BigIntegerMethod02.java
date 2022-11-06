package com.xxx.day17;

import java.math.BigInteger;

public class BigIntegerMethod02 {
    public static void main(String[] args) {
        /*
        * public BigInteger add(BigInteger val)   加法
        * public BigInteger subtract(BigInteger val)   减法
        * public BigInteger multiply(BigInteger val)   乘法
        * public BigInteger divide(BigInteger val)   除法，获取商
        * public BigInteger[] divideAndRemainder(BigInteger val)   除法，获取商和余数
        * public boolean equals(Object x)   比较是否相同
        * public BigInteger pow(int exponent)   次幂
        * public BigInteger max/min(BigInteger val)   返回较大值/较小值
        * public int  intValue(BigInteger val)   转为int类型整数，超出范围数据有误
        * */

        // 创建两个对象
        BigInteger bd1  = BigInteger.valueOf(10);
        BigInteger bd2  = BigInteger.valueOf(3);

        // 加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        // 除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr.length);
        System.out.println(arr[0]);  // 商
        System.out.println(arr[1]);  // 余数

        // 比较两个值是否相等
        boolean res = bd1.equals(bd2);
        System.out.println(res);

        // public BigInteger pow(int exponent)   次幂
        // bd1:10  10^4 = 10000
        BigInteger pow = bd1.pow(4);
        System.out.println(pow);

        // 获得最大值/最小值
        BigInteger max = bd1.max(bd2);
        BigInteger min = bd1.min(bd2);
        System.out.println(max);
        System.out.println(min);

        // 转换为基本数据类型
        System.out.println(bd1.intValue());

    }
}
