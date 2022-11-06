package com.xxx.date19;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDem {
    public static void main(String[] args) {

        // 本地日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 出生的日期时间对象
        LocalDateTime birth = LocalDateTime.of(2000, 5, 13,0,0,0,0);
        System.out.println(birth);

        // 第二个参数减第一个参数
        Duration duration = Duration.between(birth, today);
        System.out.println("相差的时间间隔对象:"+duration);

        System.out.println("-------------------");
        System.out.println(duration.toDays()); // 两个时间差的天数
        System.out.println(duration.toHours()); // 两个时间差的小时数
        System.out.println(duration.toMillis()); // 两个时间差的毫秒数
        System.out.println(duration.toMinutes()); // 两个时间差的分钟数
        System.out.println(duration.toNanos()); // 两个时间差的纳秒数

    }
}
