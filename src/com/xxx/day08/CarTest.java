package com.xxx.day08;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 1、创建一个数组用来存3个对象
        Car[] arr = new Car[3];

        // 2、创建汽车对象,数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            // 创建汽车的对象
            Car car = new Car();
            //录入品牌
            System.out.println("请输入汽车的品牌:");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("请输入汽车的价格:");
            double price = sc.nextDouble();
            car.setPrice(price);
            System.out.println("请输入汽车的颜色:");
            String color = sc.next();
            car.setColor(color);

            // 3、把汽车对象添加到数组中
            arr[i] = car;
        }
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            Car goods02 = arr[i];
            System.out.println(goods02.getBrand()+","+goods02.getPrice()+","+goods02.getColor());
        }
    }
}
