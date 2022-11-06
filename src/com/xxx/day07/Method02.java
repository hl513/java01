package com.xxx.day07;

public class Method02 {
    public static void main(String[] args) {
        /*
         * 方法的重载：
         *       在同一个类中，定义了多个 同名的方法 ，这些同名的方法具有同种的功能
         *       每个方法具有不同的 参数类型 或 参数个数，这些同名的方法，就构成了重载关系
         *简单记：
         *      同一个类中，方法名相同，参数不同的方法，与返回值无关
         *      参数不同：个数不同、类型不同、顺序不同
         * */
        int intSum = sum(10, 20);
        double doubleSum = sum(10.1, 15.4);
        int sum = sum(10, 20, 30);

        System.out.println(intSum);
        System.out.println(doubleSum);
        System.out.println(sum);

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
