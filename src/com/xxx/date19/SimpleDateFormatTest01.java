package com.xxx.date19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) throws ParseException {
        /*
        * 需求：
        *   你初恋的出生年月为 2000-11-11
        * 请用字符串表示这个数据，并将其转换为 :2000年11月11日
        * */
        //创建对象 表示 2000-11-11
        String str = "2000-11-11";
        // 创建SimpleDateFormat对象，并定义格式为年月日
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 把时间转换为 2000年11月11日
        Date parse = sdf.parse(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(parse);
        System.out.println(result);


    }
}
