package com.xxx.day08;

public class TestPhone {
    public static void main(String[] args) {
        /*
        *  类：是共同特征的描述
        * 对象：是真实存在的具体实力
        * javeBean类：用来描述一类事物的类，在javaBean里面是不写main方法的
        * */

        // 创建手机的对象
        Phone phone = new Phone();
        // 给手机赋值
        phone.brand = "华为";
        phone.price =3999;

        // 获取手机对象中的值
        System.out.println(phone.brand);
        System.out.println(phone.price);

        // 调用手机中的方法
        phone.call();
        phone.playGame();

    }
}
