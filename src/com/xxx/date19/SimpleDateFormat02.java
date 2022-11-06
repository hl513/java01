package com.xxx.date19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat02 {
    public static void main(String[] args) {

        /*
        * SimpleDateFormat的作用：
        *       格式化：把时间变成我们喜欢的格式
        *       解析：把字符串表示的时间变成Date对象\
        *
        * 构造方法
        *   public SimpleDateFormat()    构造一个SimpleDateFormat ，使用默认格式
        *   public SimpleDateFormat(String pattern)   构造一个SimpleDateFormat，使用指定的格式
        *
        * 常用方法
        * public final String format(Date date)  格式化 (日期对象-->字符串)
        * public Date parse(String source)    解析(字符串--->日期对象)
        * */

        extracted();

        // 定义一个字符串表示时间
        String str = "2022-09-29 11:11:11";
        // 利用空参构造创建SimpleDateFormat对象
        // 细节：创建对象的格式要字符串格式完全一样
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        try {
            parse = sdf.parse(str);
            System.out.println(parse.getTime());  // 获取毫秒数
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);


    }

    private static void extracted() {
        // 使用默认的格式
        Date date = new Date(0L);
        SimpleDateFormat sdf = new SimpleDateFormat();
        String str = sdf.format(date);
        System.out.println(str);

        // 利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(date);
        System.out.println(str2);
    }
}
