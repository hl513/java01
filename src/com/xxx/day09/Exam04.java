package com.xxx.day09;

public class Exam04 {
    public static void main(String[] args) {
        /*
         *   定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
         * 并在控制台输出结果
         * 数组为 int[]  arr ={1,2,3}
         *   输出为 [1,2,3]
         * */

        int[] arr = {1, 2, 3, 4, 5};
        String str = arrToString(arr);
        System.out.println(str);
    }

    // 我要干嘛
    // 我干这件事情需要什么才能完成
    // 我干完了是否需要把结果返回
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        // 当代码执行到这里，表示数组不是 null ，长度也不是 0
        for (int i = 0; i < arr.length; i++) {
            // i 表示数组的索引  arr[i]数组的元素
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ",";
            }
        }
        // 此时拼接右括号
        result = result + "]";
        return result;
    }
}
