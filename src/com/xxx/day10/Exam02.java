package com.xxx.day10;

public class Exam02 {
    public static void main(String[] args) {
        /*需求：
        *   定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回
        * 调用该方法，并在控制台输出结果
        * */
        int [] arr = {1,2,3};
        // 调用方法把数组变成字符串
        String str = toStr(arr);
        System.out.println(str);

    }
    // 我要干嘛 把数组的数据转换为字符串
    // 我干这件事物需要什么东西  数组
    // 干完这件事，是否将数据返回  字符串
    public static String toStr(int [] arr){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                builder.append(arr[i]);
            }else{
                builder.append(arr[i]).append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
