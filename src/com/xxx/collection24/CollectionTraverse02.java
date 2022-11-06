package com.xxx.collection24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTraverse02 {
    public static void main(String[] args) {
        /*
         * 迭代器遍历
         *   Iterator
         * Collection集合获取迭代器
         * Iterator<E> iterator()              返回迭代器对象，默认指向当前集合的0索引
         *
         * Iterator中常用方法
         *   boolean hasNext()           判断当前位置是否有元素，有元素返回true，没有元素返回false
         *   E next()                    获取当前位置的元素，并将迭代器对象移向下一个位置
         * */
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        // 1、迭代器遍历
        // 细节：迭代器遍历时，不能用集合的方法进行增加或删除
        // 创建指针 ，默认指向集合的0索引处
        Iterator<String> iterator = coll.iterator();
        // 判断是否有元素 利用循环不断的去获取集合中的每一个元素
        while (iterator.hasNext()) {
            // 获取元素，移动指针
            String str = iterator.next();
            System.out.println(str);
        }

        // 2、增强for遍历
        /*
         * for(元素的数据类型 变量名: 数组或集合){
         *
         * }
         * 细节：修改增强for中的变量，不会改变集合中原本的数据
         * */
        for (String s : coll) {
            System.out.println(s);
        }

        // 3、匿名内部类
        /*
         * default void forEach(Consumer<? super T> action)
         * */
        // 底层原理：
        // 其实也会自己遍历集合，依次得到每一个元素
        // 把得到的每一个元素，传递给下面的 accept方法
        coll.forEach(new Consumer<String>() {
            @Override
            // s 依次表示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 4、lamda表达式
        coll.forEach(s -> {
                    System.out.println(s);
                }
        );

    }
}
