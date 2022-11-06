package com.xxx.day17;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal05 {
    public static void main(String[] args) {
        /* public static BigDecimal valueOf(double val)   获取对象
         * public BigDecimal add(BigDecimal val)    加法
         *  public BigDecimal subtract(BigDecimal val)    减法
         *  public BigDecimal divide(BigDecimal val)    除法
         *  public BigDecimal multiply(BigDecimal val)    乘法
         *  public BigDecimal divide(BigDecimal val,精确几位，舍入模式)    除法
         */

        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(20);

        // 加法
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        // 减法
        BigDecimal bd4 = bd2.subtract(bd1);
        System.out.println(bd4);

        // 乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        // 除法
        BigDecimal bd6 = bd2.divide(bd1, RoundingMode.HALF_UP);
        System.out.println(bd6);
    }
}
