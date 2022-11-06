package com.xxx.packaging20;

import java.time.LocalDate;
import java.util.Calendar;

public class Demo05 {
    public static void main(String[] args) {
        /*
        * 判断任意的一个年份是闰年还是平年
        *   要求：用JDK7和JDK8两种方式判断
        *       提示：
        *           二月有29天是闰年
        *           一年有366天是闰年
        * */
        // jdk7
        // 我们可以把时间设置为2000年3月1日
        Calendar c = Calendar.getInstance();
         /*   c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DAY_OF_MONTH,1);*/
        c.set(2000,2,1);
        // 再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH,-1);
        // 看当前的时间是 28号 还是 29 号
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        // jdk8
        // 我们可以把时间设置为2000年3月1日
        LocalDate date = LocalDate.of(2000, 3, 1);
        // 再把日历往前减一天
        LocalDate ld2 = date.minusDays(1);
        // 看当前的时间是 28号 还是 29 号
        int ofMonth = ld2.getDayOfMonth();
        System.out.println(ofMonth);

        // true：闰年
        // false ：平年
        System.out.println(ld2.isLeapYear());

    }
}
