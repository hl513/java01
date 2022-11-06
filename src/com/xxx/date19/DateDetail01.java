package com.xxx.date19;

import java.util.Date;

public class DateDetail01 {
    /*
     * JDK7前时间相关类
     *       Date     时间    精确到毫秒
     *       SimpleDateFormat     格式化时间
     *       Calendar        日历
     * */

    public static void main(String[] args) {
        // Date 利用空参构造创建的对象，默认表示系统当前时间
        // 利用有参构造创建的对象，表示指定的时间

        // 1、创建对象表示一个时间
        Date date = new Date();
        System.out.println(date);

        // 2、创建对象表示一个指定时间
        Date date2  = new Date(0L);  // 从时间原点过了0秒的那一天
        System.out.println(date2);

        // 3、setTime修改时间  1000毫秒 = 1秒
        date2.setTime(1000L);
        System.out.println(date2);

        // 4、getTime获取当前时间的毫秒数
        long time = date2.getTime();
        System.out.println(time);

    }
}
