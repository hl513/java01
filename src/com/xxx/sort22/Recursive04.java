package com.xxx.sort22;

public class Recursive04 {
    public static void main(String[] args) {
        /*
        * 递归：
        *       递归指的是方法中调用方法本身的现象
        *       递归的注意点：
        *           递归一定要有出口，否则就会出现内存溢出
        * */
       // 大问题拆解成小问题
        // 1~100之间的和  = 100 + (1~99之间的和)
        // 1~99之间的和  = 99 + (1~98之间的和)
        int sum = getSum(100);
        System.out.println(sum);
    }
    public static int getSum(int number){
        if (number == 1){
            return 1;
        }
        // 如果number不是1
        return number +  getSum(number-1);
    }
}
