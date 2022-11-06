package com.xxx.packaging20;

public class Integer02 {
    public static void main(String[] args) {

        /*
         * 自动装箱：把基本数据类型会自动哦那转换为对应的包装类型
         * 自动拆箱： 把包装类自动的转换其对应的基本数据类型
         * */

        /*
        * public static String toBinaryString(int x)   得到二进制
        * public static String toOctalString(int x)    得到八进制
        * public static String toHexString(int x)     得到十六进制
        * public static int parseInt(String s)         将字符串类型的整数转换成int类型的整数
        * */

        // 把整数转成二进制、八进制、十六进制
        String str1 = Integer.toBinaryString(100);
        String str2 = Integer.toOctalString(100);
        String str3 = Integer.toHexString(100);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 将字符串类型转换为int类型
        String str4  = "1545";
        int j = 1548;
        int parseInt = Integer.parseInt(str4);
        System.out.println(parseInt+j);


        Integer i = 9;
        Integer i4 = new Integer(14);
        int i5 = i4;

        // 在包装类如何进行计算
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);

        // 需求：要把两个数据进行相加得到结果 3
        // 对象之间是不能直接计算的
        // 1、把对象进行拆箱，变成基本数据类型
        // 2、相加
        // 3、把得到的结果再次进行装箱，（再变回包装类型）
        int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);
        System.out.println(i3);

    }
}
