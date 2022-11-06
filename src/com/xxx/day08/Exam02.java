package com.xxx.day08;

public class Exam02 {
    /*
    * 需求：
    *   定义数组存储3个商品对象
    *   商品的属性：商品的id、名字、价格、库存
    *   创建三个商品对象，并把商品对象存入道数组当中
    * */

    public static void main(String[] args) {
        // 1、创建一个数组
        Goods [] arr = new Goods[3];

        // 2、创建三个商品对象
        Goods g1 = new Goods("001","华为P40",5999.0,100);
        Goods g2 = new Goods("002","保温杯",189.0,50);
        Goods g3 = new Goods("003","枸杞",199,70);

        // 3、把商品添加到数组当中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            // i 索引 arr[i] 元素
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
