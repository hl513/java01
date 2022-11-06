package com.xxx.day17;

import java.math.BigDecimal;

public class BigDecima04 {
    public static void main(String[] args) {
        /*
         * 构造方法获取BigDecimal对象
         *       public BigDecimal(double val)
         *       public BigDecimal(String val)
         *
         * 静态方法获取
         *       public static BigDecimal valueOf(double val)
         * */

        // 这种方式有可能不精确
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        // 通过传递字符串表示的小数来创建对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");

        System.out.println(bd3);
        System.out.println(bd4);

        // 通过静态方法获取
        BigDecimal bd5 = BigDecimal.valueOf(10);
        System.out.println(bd5);

        //细节
        // 1、如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        // 2、如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        // 3、如果我们传递的时0~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new

        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd5 == bd6); // true

    }
}
