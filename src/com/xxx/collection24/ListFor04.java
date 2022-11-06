package com.xxx.collection24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListFor04 {
    public static void main(String[] args) {

        /*
        * 迭代器遍历：      在遍历的过程中需要删除元素，请使用迭代器
        * 列表迭代器：      在遍历的过程中需要添加元素，使用列表迭代器
        * */

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------");

        // 迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("--------------");

        // 增强for遍历
        // 在循环过程中，依次表示集合中的每一个元素
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------");
        // lamda表达式遍历
        // 形参s : 依次表示集合中的每一个元素
        list.forEach((String s) -> {
                    System.out.println(s);
                }
        );

        System.out.println("-----------------");
        // 列表迭代器
        // 额外添加了一个方法，在遍历的过程中，可以添加方法
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            if ("bbb".equals(next)){
                // 只能用迭代器本身的方法去添加和删除
                listIterator.add("qqqq");
            }
        }
        System.out.println(list);

    }
}
