package com.xxx.date19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest02 {
    public static void main(String[] args) throws ParseException {
        /*
        * 秒杀活动
        *   活动开始时间  2023年11月11日   0:0:0
        *   活动结束时间  2023年11月11日   0:10:0
        *
        *   小明的下单时间为 ： 2023年11月11日 0:01:00
        *   小李的下单时间为 ： 2023年11月11日 0:11:00
        * 用代码说明这两个情况有没有参加上秒杀活动
        * */

        // 创建时间对象
        String str = "2023-11-11 0:01:00";
        String startTime = "2023-11-11 0:00:00";
        String endTime = "2023-11-11 0:10:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 将字符串转为日期对象
        Date parse = sdf.parse(str);

        // 将开始时间和结束时间转换为 毫秒值
        Date start = sdf.parse(startTime);
        Date end = sdf.parse(endTime);

        // 得到毫秒数
        long time = parse.getTime();

        // 得到开始活动和结束活动时间的毫秒值
        long start1 = start.getTime();
        long end1  = end.getTime();

        if (time > start1 && time <end1){
            System.out.println("参加上秒杀活动");
        }

        System.out.println(time);
    }
}
