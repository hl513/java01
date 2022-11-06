package com.xxx.date19;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUtilDem {
    public static void main(String[] args) {
        // 当前时间
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 生日时间
        LocalDateTime birth = LocalDateTime.of(2000, 5, 13, 0, 0, 0);
        System.out.println(birth);

        System.out.println("相差的年数:"+ ChronoUnit.YEARS.between(birth,today));

    }
}
