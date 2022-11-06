package com.xxx.day09;

public class Exam08 {
    public static void main(String[] args) {
        /*
        *   身份证信息查看
        *   1、2位 ：省份
        *   3、4位 城市
        *   5、6位 区县
        *   7-14位：出生年、月、日
        *   15、16：所在地派出所
        *   17位：性别（奇数是男，偶数是女）
        *   18位： 个人信息码（随机产生的）
        * */

        // 1、定义一个字符串记录身份证号码
        String id = "321281202001234754";
        // 2、获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        String result = year+"年"+month+"月"+day+"日";
        System.out.println("人物信息为:");
        System.out.println(result);

        // 获取性别
        char gender = id.charAt(16);  // '3' --->3
        // 将字符转换为数字
        /*ASCII表进行转换
         * '0'---------48
         * '1'---------49
         * '2'---------50
         * '3'---------51
         * '4'---------52
         * '5'---------53
         * '6'---------54
         * '7'---------55
         * '8'---------56
         * '9'---------57\
         * 将 字符 - 48 =数字
         * */
        int sex = gender- 48;
        if (sex % 2 == 0){
            System.out.println("性别为：妹子");
        }else{
            System.out.println("性别为:男");
        }

    }
}
