package com.xxx.sort22;

import java.util.Arrays;

public class LamdaDem08 {
    public static void main(String[] args) {
        // 初识 lamda表达式
        Integer[] arr = {1, 58, 74, 95, 45, 65, 47, 2, 54, 74, 14, 2536};

        /*  Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/

        /*
         * ()->{}
         * ():对应着方法的形参
         * -> 固定格式
         * {}：对应着方法的方法体
         * */
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });
        System.out.println(Arrays.toString(arr));

        // 1、利用匿名内部类的形式去调用下面的方法
        // 调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
        // 如果实现类对象只要用到一次，就可以使用匿名内部类的形式进行书写
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳……");
            }
        });
        // 2、利用匿名内部类进行改写
        method(() -> {
            System.out.println("正在游泳……2");
        });
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

interface Swim {
    public abstract void swimming();
}