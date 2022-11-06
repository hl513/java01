package com.xxx.algorithm23;

public class Test03 {
    public static void main(String[] args) {
        /*
         * 猴子吃猴子
         *   有一堆猴子，猴子第一天吃了其中的一半，并多吃一个。以后每天猴子都吃当前剩下的一半，然后再多吃一个，第十天的时候
         * （还没吃），发现只剩下一个桃子了，请问，最初总共多少个桃子？
         * */
        // 10天    剩1个
        // 9       (1+1) * 2 = 4
        // 8       (4+1) * 2 = 10
        // 7       (10+1) * 2 = 22
        // 6       (22+1) * 2 = 46
        // 每一天的桃子数量都是后一天数量加1，乘以2
        System.out.println(fun(1));  // 1534

    }

    public static int fun(int n) {
        if (n <= 0 || n >= 11) {
            return -1;
        }
        // 递归的出口
        if (n == 10) {
            return 1;
        }
        return (fun(n + 1) + 1) * 2;
    }
}
