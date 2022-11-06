package com.xxx.packaging20;

public class PackDetail01 {
    public static void main(String[] args) {
        /*
         * byte   Byte
         * short  Short
         * char   Character
         * int    Integer
         * long   Long
         * float  Float
         * double Double
         * boolean  Boolean
         * */

        // 1、利用构造方法获取Integer对象   JDK5以前的方式
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);

        // 2、利用静态方法获取Integer第项   JDK5以前的方式
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);  // 以八进制的方式进行输出
        System.out.println(i3 == i4);
        System.out.println(i5);

        // 3、这两种方式获取对象的区别
        // 在实际开发中，-128~127之间的数据，用的比较多
        // 所以，提前为在这个范围内的每一个数据都创建好对象
        // 如果要用到了不会创建新的，而是返回已经创建好的对象
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7); // true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9); // false

        // 因为看到new关键字，在java中，每一次new都是创建一个新的对象
        // 所以下面的两个对象都是new出来，地址值不一样
        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10 == i11); // false

        Integer i12 = new Integer(128);
        Integer i13 = new Integer(128);
        System.out.println(i12 == i13);  // false

    }
}
