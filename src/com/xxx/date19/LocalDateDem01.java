package com.xxx.date19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDem01 {
    public static void main(String[] args) {
        // 1、获取当前时间的日历兑现（包含 年月日）
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期：" + nowDate);

        // 2、获取指定时间的日历对象
        LocalDate localDate = LocalDate.of(2022, 9, 30);
        System.out.println("指定的日期:" + localDate);

        // 3、get系列方法获取日历中的每一个属性值
        // 获取年
        int year = localDate.getYear();
        System.out.println("year:" + year);

        // 获取月
        // 方式一
        Month month = localDate.getMonth();
        System.out.println(month); // 英文的
        System.out.println(month.getValue());

        // 方式二
        int m = localDate.getMonthValue();
        System.out.println("month:"+m);

        // 获取日
        int dayOfYear = localDate.getDayOfYear();
        // 获取的是一年中的第几天
        System.out.println(dayOfYear);
        // 获取的是一个月中的第几天
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(dayOfMonth);
        // 获取的是一个星期中的第几天
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);  // 英文的,表示星期几
        System.out.println(dayOfWeek.getValue()); // 获取对应的值

        // is开头的方法表示判断
        boolean before = localDate.isBefore(localDate);
        System.out.println(before);
        boolean after = localDate.isAfter(localDate);
        System.out.println(after);

        // with开头的方法表示修改，只能修改年月日
        LocalDate withYear = localDate.withYear(2000);
        System.out.println(withYear);

        // minus开头的方法表示减少，只能减少年月日
        LocalDate minusYears = localDate.minusYears(1); // 将年-1
        System.out.println(minusYears);

        // plus开头的方法表示增加，只能增加年月日
        LocalDate plusYears = localDate.plusYears(2);
        System.out.println(plusYears);

        // 判断今天是否是你的生日
        LocalDate birth = LocalDate.of(2000, 5, 13);
        LocalDate date = LocalDate.now();
        System.out.println("今天是你生日吗:"+birth.equals(date));

        // 月日对象
        MonthDay monthDay = MonthDay.of(birth.getMonthValue(),birth.getDayOfMonth());
        MonthDay from = MonthDay.from(date);
        System.out.println(from);
        System.out.println(monthDay);
    }
}
