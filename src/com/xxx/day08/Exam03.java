package com.xxx.day08;

public class Exam03 {
    public static void main(String[] args) {

        /*
        * 定义数组存储3部手机对象
        *   手机的属性：品牌、价格、颜色
        *   要求：计算出三部手机的平均价格
        * */
        // 1、创建一个数组
        PhoneGoods [] arr = new PhoneGoods[3];

        // 2、创建手机的对象
        PhoneGoods p1 = new PhoneGoods("小米",1999,"白色");
        PhoneGoods p2 = new PhoneGoods("华为",2999,"黑色");
        PhoneGoods p3 = new PhoneGoods("苹果",6999,"蓝色");

        // 3、把手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        // 4、遍历
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
             // i 索引 arr[i]元素(手机对象)
            PhoneGoods phoneGoods = arr[i];
            sum = sum+ phoneGoods.getPrice();
        }

        // 平均值
        double avg = sum / arr.length;
        System.out.println(avg);

    }
}
