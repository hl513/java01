package com.xxx.algorithm23;

public class Test04 {
    public static void main(String[] args) {
        /*
         * 爬楼梯
         *   可爱的小明喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
         * 如果这个楼梯有20个台阶，小明一共有多少种爬法？
         * */
        /*
         * 运算结果：
         *   1层台阶              1种爬法
         *   2层台阶              2种爬法
         *   7层台阶              21种爬法
         * 20个台阶的爬法  =  19个台阶的爬法  + 18个台阶的爬法
         * */
        System.out.println(fun(20)); // 10946
    }

    public static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fun(n - 1) + fun(n - 2);

    }
}
