package com.xxx.day11;

import java.util.ArrayList;

public class Exam04 {
    public static void main(String[] args) {

        /*需求：
        *   定义JavaBean类：Phone，
        *   Phone属性：品牌，价格
        *   main方法中定义一个集合，存入三个手机对象
        *   分别为：小米 1000，苹果 8000，华为 6000
        *   定义一个方法，将价格低于3000的手机信息返回
        * */

        // 创建集合
        ArrayList<Phone> list = new ArrayList<>();

        // 创建对象
        Phone p1 = new Phone("小米", 1000.0);
        Phone p2 = new Phone("苹果", 8000.0);
        Phone p3 = new Phone("华为", 6000.0);

        // 将对象添加到集合中去
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // 调用方法
        ArrayList<Phone> phone = getPhone(list);
        for (int i = 0; i < phone.size(); i++) {
            Phone p= phone.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }
    }

    // 我要干嘛  将价格低于3000的信息返回
    // 我完成这件事情需要什么   集合
    // 做完这件事，是否需要返回数据  手机信息
    public static ArrayList getPhone(ArrayList<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            double price = p.getPrice();
            if (price < 3000){
               result.add(p);
            }
        }
        return result;
    }
}
