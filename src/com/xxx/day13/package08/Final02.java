package com.xxx.day13.package08;

import java.util.Arrays;

public class Final02 {
    /*
     * final关键字
     *   修饰方法时： 表明该方法是最终方法，不能被重写 (当前方法是一种规则时，就可以运用final修饰)
     *   修饰类时： 表明该类是最终类，不能被继承  ()
     *   修饰变量：叫做常量，只能被赋值一次  Math类时用到 Π上面
     *
     * 常量：
     *      实际开发中，常量一般作为系统的的配置信息，方便维护，提高可读性
     *    常量的命名规范：
     *      1、多个单词，全部大写
     *      2、多个单词：全部大写，单词之间用 下划线隔开
     *    细节：
     *      final修饰的变量是基本类型：那么变量存储的数据值不能发生改变
     *      final修饰的变量是引用类型，那么存变量存储的 地址值 不能发生改变，对象内部的可以改变
     * */
    public static void main(String[] args) {
        final int a = 10;
        // a=100;
        System.out.println(a);

        final double PI = 2.1415926;

        final int[] ARR = {1, 2, 3, 4, 5};
        for (int i = 0; i < ARR.length; i++) {
            ARR[i] = 5 + i;
        }
        // 内部的地址值没有发生改变，但是内部的变量可以改变
        System.out.println(Arrays.toString(ARR));

    }
}

class Fu {
    public void show() {
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu {
    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
}