package com.xxx.api16.math01;

public class Test01 {
    public static void main(String[] args) {
        // 判断一个数是否是质数
        int number = 10;
        boolean prime = isPrime(number);
        System.out.println(prime);

    }

    // 判断一个数是否是质数，效率过低
    private static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    // 16 直接从它的平方根往前就行
    private static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}