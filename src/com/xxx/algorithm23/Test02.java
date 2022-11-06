package com.xxx.algorithm23;

public class Test02 {
    public static void main(String[] args) {
        /*
         * 不死神兔：
         *   有一个很有名的数学逻辑题叫做不死神兔问题。有一对兔子，从出生第三个月起每个月都生一对兔子，小兔子长到第三个月
         * 后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少？
         *  月份                        数量
         *   1                           1
         *   2                           1
         *   3                           2
         *   4                           3
         *   5                           5
         *   6                           8
         * */
        // 求解1：
        // 创建一个长度为12的数组
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        // 利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        // 获取最大索引上的数据即可
        System.out.println(arr[11]);

        // 求解2：第二种方案 递归
        // 斐波那契数列   1 1 2 3 5 8 13 21 ……
        System.out.println(fibonacci(12));

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
