package com.xxx.date19;

import java.util.Date;
import java.util.Random;

public class DateTest01 {
    public static void main(String[] args) {
        /*
         * 需求1：打印时间原点开始一年之后的时间
         * 需求2：定义任意两个Date对象，比较一下那个时间在前，那个时间在后
         * */

        // 需求1：打印时间原点开始一年之后的时间
        extracted();

        // 需求2：定义任意两个Date对象，比较一下那个时间在前，那个时间在后
        extracted2();
    }

    private static void extracted2() {
        Random r = new Random();
        // 创建两个时间对象
        Date date1 = new Date(Math.abs(r.nextInt()));
        Date date2 = new Date(Math.abs(r.nextInt()));

        long time1 = date1.getTime();
        long time2 = date2.getTime();

        if (time1 > time2) {
            System.out.println("第一个时间在后面，第二个时间在前面");
        } else if (time1 < time2) {
            System.out.println("第一个时间在前面，第二个时间在后面");
        } else {
            System.out.println("两个时间相等");
        }
    }

    private static void extracted() {
        // 需求1：打印时间原点开始一年之后的时间
        // 创建对象，表示时间原点
        Date date = new Date(0L);
        // 获取date的毫秒数
        long time = date.getTime();
        // 在这个基础上我们要加一年的毫秒值
        time = time + 1000L * 60 * 60 * 24 * 365;
        // 把计算之后的时间毫秒值，再设置会date当中
        date.setTime(time);
        System.out.println(date);
    }
}
