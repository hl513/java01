package com.xxx.packaging20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) throws ParseException {
        /*
         * 请使用代码实现计算你活了多少天 用JDK7和JDK8两种方式来完成
         * */

        // JDK7
        // 规则：只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
        // 1、出生年月日
        String birth = "2000年5月13日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birth);
        long birthTime = date.getTime();

        // 2、获取当前时间的毫秒值
        long todayTIme = System.currentTimeMillis();
        // 3、计算间隔多少天
        long time = todayTIme - birthTime;
        System.out.println(time / 1000 / 60 / 60 / 24);


        // JDK8
        // Period
        // Duration
        // ChronoUnit
        LocalDate ld1 = LocalDate.of(2000, 5, 13);
        LocalDate ld2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);

    }
}
