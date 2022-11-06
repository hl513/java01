package com.xxx.day17;

import java.math.BigInteger;
import java.util.Random;

public class BigInteger01 {
    public static void main(String[] args) {
        // BigInteger
        /*
         * public BigInteger(int num,Random random)  获取随机大整数 范围 0~2^num-1
         * public BigInteger(String val)   获取指定的大整数
         * public BigInteger(String val,int radix)   获取指定进制的大整数
         *
         * public static BigInteger valueOf(long val)   静态方法获取BigInteger的对象，内部有优化
         * 细节：对象一旦创建，内部记录的值不能发生改变
         *      只要进行计算都会产生一个新的BigInteger对象
         * */

        // 1、获取随机大整数  2^4-1
        BigInteger bd1 = new BigInteger(4, new Random());
        System.out.println(bd1);

        // 2、获取指定的大整数  只能是数字类型的字符串，不能有小数点
        BigInteger bd2 = new BigInteger("9223372036854775810");
        System.out.println(bd2);


        // 3、获取指定进制的大整数 将前面的数字转成二进制表示
        // 细节：
        /*
         * 1、字符串中的数字必须是整数
         * 2、字符串中的数字必须要跟进制吻合
         * */
        BigInteger bd3 = new BigInteger("1001", 2);  // 9
        System.out.println(bd3);

        // 静态方法获取BigInteger的对象，内部有优化
        /*
         * 细节：
         *  1、能表示范围小，只能在long的取值范围之内，如果超过long的取值范围就不行了
         *  2、在内部对常用的数字 -16~16进行了优化
         * 提前创建号BigInteger对象，如果多次获取不会重新创建对象的
         * */
        BigInteger bd4 = BigInteger.valueOf(9223372036854775806l);
        System.out.println(bd4);

        BigInteger bd5 = BigInteger.valueOf(15);
        BigInteger bd6 = BigInteger.valueOf(15);
        System.out.println(bd5 == bd6);

        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);

        System.out.println(Long.MAX_VALUE);


    }
}
