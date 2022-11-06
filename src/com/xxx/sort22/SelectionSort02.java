package com.xxx.sort22;

public class SelectionSort02 {
    public static void main(String[] args) {
        /*
            选择排序：
                从索引0开始，拿着每一个索引上的元素跟后面的元素依次比较，
                    小的放前面，大的放后面，以此类推
                1、从0索引开始，跟后面的元素一一比较
                2、小的放前面，大的放后面
                3、第一轮循环结束后，最小的数据已经确定
                4、第二轮循环从1索引开始以此类推
                5、第三轮循环从2索引开始以此类推
                6、第四轮循环从3索引开始依次类推
        * */

        // 1、定义数组
        int[] arr = {2, 4, 5, 3, 1};

        /*   // 2、利用选择排序让数组变成  1 2 3 4 5
        // 第一轮：从0索引开始，跟后面的元素一一比较
        for (int i = 0+1; i < arr.length; i++) {
            // 拿着0索引跟后面的数据进行比较
            if (arr[0] > arr[i]) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }*/
        selectionSort(arr);
        printArr(arr);


    }

    public static int[] selectionSort(int[] arr) {
        // 外循环表示循环几轮
        // i ：表示这一轮中，拿着那个索引上的数据跟后面的数据进行比较交换
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环：每一轮我要干什么?
            // 拿着 i 跟 i 后面的数据进行交换
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
