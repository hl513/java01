package com.xxx.collection24;

import java.util.ArrayList;
import java.util.List;

public class ListDem03 {
    public static void main(String[] args) {
        /*
         * list集合特有的方法
         *  void add(int index,E element)            在此集合中的指定位置插入指定的元素
         *  E remove(int index)                      删除指定索引处的元素，返回被删除的元素
         *  E set(int index,E element)               修改指定索引处的元素，返回被修改的元素
         *  E get(int index)                          返回指定索引处的元素
         */

        // 创建一个集合
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // void add(int index,E element)            在此集合中的指定位置插入指定的元素
        // 细节：原来索引上的元素依次往后移
        list.add(1,"QQQ");

        //  E remove(int index)                      删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(2));

        //  E set(int index,E element)               修改指定索引处的元素，返回被修改的元素
        list.set(1,"AAA");

        // E get(int index)                          返回指定索引处的元素
        System.out.println(list.get(2));

        // 打印集合
        System.out.println(list);
    }
}
