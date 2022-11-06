package com.xxx.day09;

public class CreateString01 {
    public static void main(String[] args) {
        /*
        * public String()    创建空白字符串，不含任何内容
        * public String(String xxx) 根据传入的字符串，创建字符串对象
        * public String(char[] chs)  根据字符数组，创建字符串对象
        * public String(byte[] chs)  根据字节数组，创建字符串对象
        * */

        // 1、直接赋值的方式，系统会检查该字符串在串池中是否存在，不存在，则创建新的，存在，复用
        String s1 = "abc";
        System.out.println(s1);

        // 2、使用new的方式来获取一个字符串对象
        // 空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@"+s2+"1"); // ""

        // 3、有参构造，传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象 (脱裤子放屁)
        String s3 = new String("abcd");
        System.out.println(s3);

        // 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        // 需求：我要修改字符数组的内容  abc  Abc
        // 将字符串转换为 字符数组，将字符数组里面的内容修改后再转换为字符串
        char [] chs = {'a','b','c','d','e','f'};
        String s4 = new String(chs);
        System.out.println(s4);

        // 传递一个字节数组，根据字节数组的内容再创建一个新的字节数组
        // 拿着字节去 ASIC表里面查找，然后转换
        // 需求：以后在网络当中传输的数据其实都是字节信息，一般把字节信息进行转换，转成字符串
        byte [] bytes = {98,97,96,95,94};
        String s5 = new String(bytes);
        System.out.println(s5);

    }
}
