package com.xxx.algorithm23;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        /*
         * 需求：定义数组并存储一些女朋友对象，利用Arrays的sort方法进行排序
         *   需求1：属性有姓名、年龄、身高
         *   需求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样的按照姓名的字母进行排序
         * */

        // 1、 创建三女朋友的对象
        GirlFriend gf1 = new GirlFriend("xiaoshishi", 18, 1.85);
        GirlFriend gf2 = new GirlFriend("xiaodandan", 19, 1.74);
        GirlFriend gf3 = new GirlFriend("xiaomumu", 21, 1.64);

        // 2、定义数组存储女朋友的信息
        GirlFriend[] arr = {gf1, gf2, gf3};

        // 3、利用Arrays中的sort方法进行排序
        // 匿名内部类
        /*Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                // 按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样的按照姓名的字母进行排序
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });*/

        // lamda表达式
        Arrays.sort(arr, (o1, o2)-> {
                // 按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样的按照姓名的字母进行排序
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }else{
                    return 0;
                }
        });

        // 4、展示数组中的内容
        System.out.println(Arrays.toString(arr));

    }
}
