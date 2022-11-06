package com.xxx.date19;

import java.time.LocalTime;

public class LocalTimeDem02 {
    public static void main(String[] args) {

        // 1、获取本地时间的日历对象（包含，时分秒）
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间："+nowTime);

        int hour = nowTime.getHour();// 时
        System.out.println("hour:"+hour);

        int minute = nowTime.getMinute(); // 分
        System.out.println("minute:"+minute);

        int second = nowTime.getSecond(); // 秒
        System.out.println("second:"+second);

        int nano = nowTime.getNano();// 纳秒
        System.out.println(nano);

        System.out.println("------------------");
        System.out.println(LocalTime.of(8, 28)); // 时分
        System.out.println(LocalTime.of(2, 8, 47)); // 时分秒
        LocalTime mTime = LocalTime.of(8, 30, 30, 150);

        // is系列的方法
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

        // with系列的方法 只能修改 时、分、秒
        System.out.println(nowTime.withHour(10));

        // minus系列的方法，只能修改 时、分、秒  减少
        System.out.println(nowTime.minusHours(1));

        // plus系列的方法，只能修改 时 分 秒  增加
        System.out.println(nowTime.plusHours(1));

    }
}
