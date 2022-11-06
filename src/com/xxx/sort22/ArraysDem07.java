package com.xxx.sort22;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDem07 {
    public static void main(String[] args) {
        /*
        * Arrays：操作数组的工具类
        *
        * public static String toString(数组)   将数组拼接成一个字符串
        * public static int binarySearch(数组,查找的元素)    二分查找法查找元素
        * public static int[] copyOf(原数组,新数组长度)      拷贝数组
        * public static int[] copyOfRange(原数组,起始索引,结束索引)   拷贝数组（指定范围）
        * public static void fill(数组,元素)    填充数组
        * public static void sort(数组)    按照默认方式进行数组排序
        * public static void sort(数组,排序规则)     按照指定的规则排序
        * */

        System.out.println("------------toString----------");
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        // binarySearch  :二分查找法查找元素
        // 细节1：二分查找的前提，数组中的元素必须是有序的，数组中的元素必须是升序的
        // 细节2：如果要查找的元素是不存在的，返回的是  插入点 - 1
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,6));

        // copyOf：拷贝数组
        int [] newArr1 = Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(newArr1));

        // copyOfRange : 拷贝数组 指定范围
        int [] newArr2 = Arrays.copyOfRange(arr,0,9);
        System.out.println(Arrays.toString(newArr2));


        // 填充数组   fill(数组，元素)
        int [] newArr3 = new int[10];
        Arrays.fill(newArr3,1);
        System.out.println(Arrays.toString(newArr3));

        // sort 排序
        int [] newArr4 = {1,5,4,9,8,7,6,41,54};
        Arrays.sort(newArr4);
        System.out.println(Arrays.toString(newArr4));

        // sort排序
        /*
        * 细节：
        *   只能给引用数据类型的数组进行排序
        *   如果数组是基本数据类型，需要变成其对应的包装类
        * */
        Integer [] newArr5 = {1,4,78,98,65,45,74,32,14,74};
        // 第二个参数是一个接口：所以我们在调用方法的时候，需要传递这个接口的实现类对象，作为排序的规则
        // 利用插入排序 + 二分查找的方式进行排序
        // 默认把0索引的数据当作是有序的序列 1索引到最后认为是无序的
        Arrays.sort(newArr5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        System.out.println(Arrays.toString(newArr5));

    }
}
