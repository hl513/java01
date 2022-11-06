package com.xxx.sort22;

public class RecursiveDem05 {
    public static void main(String[] args) {
        /*
         * 用递归求5的阶乘，并把结果在控制台输出
         *     心得:
         *          方法内部再次调用方法的时候，参数必须更加靠近出口
         * */
        int i = recursiveDem(5);
        System.out.println(i);

        int result = recursiveDem02(3);
        System.out.println(result);

        int sum = facSum(3);
        System.out.println(sum);

    }

    // 求某个数的阶乘
    public static int recursiveDem(int number) {
        if (number == 1) {
            return 1;
        }
        return number * recursiveDem(number - 1);
    }

    // 求某个数的阶乘所有和
    // 3*2*1 + 2*1 + 1*1 = 9
    public static int recursiveDem02(int number) {
        if (number == 1) {
            return number;
        }
        int sum = 0;
        sum = recursiveDem(number) + recursiveDem02(number - 1);
        return sum;
    }

    public static int facSum(int number) {
        int sum = 0;
        int i = 1;
        // 外层循环负责求阶乘的和
        while (i <= number) {
            int facResult = 1;
            int j = 1;
            // 内层循环负责完全求阶乘的细节
            while (j <= i) {
                facResult = facResult * j;
                j++;
            }
            i++;
            sum = sum + facResult;
        }
        return sum;
    }

}
