package com.xxx.date19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDem03 {
    public static void main(String[] args) {

        // 当前时间的日历对象 （包含 年月日时分秒）
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        System.out.println("年:"+nowDateTime.getYear());
        System.out.println("月:"+nowDateTime.getMonth());
        System.out.println("一个月中的第几天:"+nowDateTime.getDayOfMonth());
        System.out.println("一年中的第几天:"+nowDateTime.getDayOfYear());
        System.out.println("一个星期中的第几天:"+nowDateTime.getDayOfWeek());
        System.out.println("一个星期中的第几天"+nowDateTime.getDayOfWeek().getValue());


        // 转换为时分秒 纳秒
        LocalTime localTime = nowDateTime.toLocalTime();
        System.out.println(localTime);

        // 转换为 年月日
        LocalDate localDate = nowDateTime.toLocalDate();
        System.out.println(localDate);

    }
}
