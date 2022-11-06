package com.xxx.day11;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        // 创建集合的对象
        // 繁星：限定集合中存储数据的类型
        ArrayList<Integer> list = new ArrayList<>();
        // 增
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        // 改
        list.set(3,500);

        // 删 返回的是被删除的元素
        Integer remove = list.remove(3);
        System.out.println(remove);

        // 长度
        System.out.println(list.size());

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
        * boolean add(E e) 添加元素，返回值表示是否添加成功
        * boolean remove(E e)  删除指定元素，返回值表示是否删除成功
        * E remove (int index)  删除指定索引的元素，返回被删除的元素
        * E set(int index,E e)  修改指定索引下的元素，返回原来的元素
        * E get(int index)  获取指定索引的元素
        * int size()    集合的长度，也就是集合中元素的个数
        *
        * */

    }
}
