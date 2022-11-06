package com.xxx.date19;

public class JDkToDateDetail {
    public static void main(String[] args) {
        /*
        *   Date类
        *       ZoneId: 时区
        *       Instant: 时间戳
        *       ZoneDateTime:   带时区时间
        *
        *   日期格式化类：
        *       DateTimeFormatter : 用于时间的格式化和解析
        *
        *   日历类：
        *       Calendar
        *           localDate: 年、月、日
        *           localTime: 时、分、秒
        *           localDateTime: 年、月、日、时、分、秒
        *       常用方法：
        *           static XXX.now()             获取当前时间的对象
        *           static XXX.of(...)           获取指定时间的对象
        *           get开头的方法                 获取日历中的年、月、日、时、分、秒等信息
        *           isBefore,isAfter            比较两个LocalDate
        *           with开头的                   修改时间系列的方法
        *           minus开头的                  减少时间系列的方法
        *           plus开头的                   增加时间系列的方法
        * public LocalDate toLocalDate()        LocalDateTime转换成一个LocalDate对象
        * public LocalTime toLocalTime()        LocalDateTime转换成一个LocalTime对象
        *
        *   工具类：
        *       Duration : 时间间隔(秒，纳秒)
        *       Period : 时间间隔(年、月、日)
        *       ChronoUnit : 时间间隔（所有单位）
        * */
    }
}
