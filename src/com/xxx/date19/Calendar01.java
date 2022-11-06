package com.xxx.date19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar01 {
    public static void main(String[] args) throws ParseException {
        /*
         * Calendar
         *       代表了系统当前时间的日历对象，可以单独修改，获取时间中的年、月、日
         *       细节：Calendar 是一个抽象类，不能直接创建对象
         *
         * 方法
         * public static Calendar getInstance()            获取当前时间的日历对象
         * public final Date getTime()                     获取日期对象
         * public final setTime(Date date)                 给日历设置日期对象
         * public long getTimeMillis()                     拿到时间毫秒值
         * public void setTimeInMillis(long millis)        给日历设置时间毫秒值
         * public int get(int field)                       取日历中的某个字段信息
         * public void set(int field,int value)            修改日历的某个字段信息
         * public void add(int field,int amount)           为某个字段增加/减少指定的值
         *
         * */

        // 1、获取日历对象
        // 细节：Calendar 是 一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        // 底层原理：
        // 会根据系统的不同时区来获取不同的日历对象，默认表示当前时间
        // 会把时间中的纪元、年、月、日、时、分、秒、星期，等等的都放到一个数组当中
        // 细节2：
        // 月份：范围0~11 如果获取出来的是11.那么实际上是12月
        // 星期：在老外的眼中，星期日是一周中的第一天
        Calendar calendar = Calendar.getInstance();

        // 2、修改一下日历代表的时间
        Date date = new Date(0L);
        calendar.setTime(date);
        System.out.println(calendar);

        /* public int get(int field)                       取日历中的某个字段信息
         * public void set(int field,int value)            修改日历的某个字段信息
         * public void add(int field,int amount)           为某个字段增加/减少指定的值
         */
        // 这里有一个数组，从0~17代表不同的意思，可以去看源码 定义成了常量
        int year = calendar.get(Calendar.YEAR);
        int month =calendar.get(Calendar.MONTH);
        int day  = calendar.get(Calendar.DAY_OF_WEEK);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("year:"+year +" month:"+(month+1)+" day:"+day+" week:"+getWeek(week));

        // 修改某个字段的值
        calendar.set(Calendar.YEAR,2000);
        calendar.set(Calendar.MONTH,11);
        calendar.set(Calendar.DAY_OF_MONTH,25);

        // 为某个字段增加/减少
        // 调用方法在这个基础上增加一个月
        calendar.add(Calendar.MONTH,1);

        // 获取指定的时间中的某个字段
        String str  ="2022-09-29";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(str);
        calendar.setTime(parse);
        int i = calendar.get(Calendar.YEAR);
        System.out.println(i);

    }

    // 查表法
    // 传入对应的数字 1~7
    // 返回对应的星期
    public static String getWeek(int index){
        // 定义一个数字，让汉字星期几，与1~7产生对应的关系
        String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        // 根据索引返回对应的星期
        return arr[index];
    }

}
