package com.xxx.api16.math01;

public class Test02 {
    public static void main(String[] args) {
        // 三位数 1^3+5^3+3^3=153
        // 输入的位数
        int count=0;
        for (int j = 0; j <= 999; j++) {
            int ge = j % 10;
            int shi = j / 10 % 10;
            int bai = j / 100 % 10;
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (j == sum){
                count++;
            }
        }
    }
}
