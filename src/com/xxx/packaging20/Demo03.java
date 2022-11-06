package com.xxx.packaging20;

public class Demo03 {
    public static void main(String[] args) {
        /*
         * 定义一个方法自己实现 toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         * 除基取余法：
         *   不断的除以基数（几进制，基数就是几） 得到余数
         *   165 / 2
         *   直到商为0，再将余数倒着拼起来即可
         * */

        int number = 16;
        String string = toBinaryString(number);
        System.out.println(string);
    }

    public static String toBinaryString(int number) {
        // 核心逻辑：不断的去除以2，得到余数，一直到商为0就结束
        // 还需要把余数倒着拼接起来

        // 定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();

        // 不断的除以2 获取余数
        while (true) {
            if (number == 0) {
                break;
            }
            // 获取余数  %
            int remaindar = number % 2;
            // 倒着拼接
            sb.insert(0, remaindar);
            // 除以  /
            number = number / 2;
        }
        return sb.toString();
    }
}
