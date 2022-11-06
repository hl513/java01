package com.xxx.search21;

public class BinarySearch03 {
    public static void main(String[] args) {
        /*
         * 二分查找/折半查找
         *   前提条件：数组中的数据必须是有序的
         *   核心逻辑:每次排除一半的查找范围
         * */

        /*
         * 定义两个索引  min和max分别代表 开始索引和结束索引
         * mid 是在 min 和 max 中间的
         * 不断的修改 min  和 max
         * 如果要查找的元素在mid的左边，缩小范围时，min不变，max等于mid-1
         * 如果要查找的元素在mid的右边，缩小范围时，max不变，min等于mid+1
         * */
        // 查询某个元素在数组中的索引
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 5;
        System.out.println(binarySearch(arr, 7));
    }

    // 参数
    public static int binarySearch(int[] arr, int number) {
        // 1、定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length;
        // 2、利用循环不断的去查找要找的数据
        while (true) {
            if (min > max) {
                return -1;
            }
            // 3、找数据,找中间位置
            int mid = (max + min) / 2;
            // 4、拿着mid指向的元素跟要查找的元素进行比较
            if (arr[mid] > number) {
                // 1、number在mid的左边
                // min不变，max = mid -1
                max = mid - 1;
            } else if (arr[mid] < number) {
                // 2、number在mid的右边
                // max不变 min = mid + 1
                min = mid + 1;
            } else {
                // 3、number跟mid指向的元素一样
                return mid;
            }
        }
    }
}
