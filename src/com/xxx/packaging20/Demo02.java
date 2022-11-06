package com.xxx.packaging20;

public class Demo02 {
    public static void main(String[] args) {
        /*
        * 自家实现parseInt方法的效果，将字符串形式的数据转换成整数
        * 要求：
        *       字符串中只能是数字不能有其他字符
        *       最少一位，最多10位
        *       0不能开头
        * */
        // 定义一个字符串
        String str = "12346789";
        // 校验字符串
        // 习惯：会先把异常数据进行过滤，生下来就是正常的数据
        if (!str.matches("[1-9]\\d{0,9}")){
            // 错误的数据
            System.out.println("数据格式有误");
        }else{
            System.out.println("数据格式正确");
            // 类型转换
            // 3、定义一个变量，表示最终的结果
            int number = 0;
            // 4、遍历字符串得到里面的每一个字符
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                // '1'---->1   '1'-'0' = 1
                int num = c-'0';
                // 把每一位数字放到number当中
                number = number * 10 + num;
            }
            System.out.println(number);
        }
    }
}
