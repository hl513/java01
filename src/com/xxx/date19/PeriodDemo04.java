package com.xxx.date19;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo04 {
    public static void main(String[] args) {
        // 当地本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 生日的 年月日
        LocalDate birth = LocalDate.of(2000, 5, 13);
        System.out.println(birth);

        // 第二个参数减第一个参数
        Period period = Period.between(birth, today);

        System.out.println("相差的时间间隔对象："+period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());

    }
}
