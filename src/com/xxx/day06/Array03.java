package com.xxx.day06;

public class Array03 {
    public static void main(String[] args) {
        // 数组动态初始化: 初始化时只指定数组长度，由系统为数组分配初始值
        // 格式： 数据类型 [] 数组名 =  new 数据类型[数据长度]

        String [] arr = new String[5];
        // 添加学生
        arr[0]="张三";
        arr[1]="李四";
        // 获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        /*
        * 数组默认初始化值的规律
        * 整数类型  默认为0
        * 小数类型  默认为0.0
        * 字符类型  默认初始化 /u0000
        * 布尔类型  默认初始值 false
        * 引用数据类型   默认初始值 null
        * */

        int [] arr1 = new int[3];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

    }
}
