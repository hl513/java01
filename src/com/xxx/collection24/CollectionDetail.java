package com.xxx.collection24;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDetail {
    public static void main(String[] args) {
        /*
        * Collection:单列集合
        * list : ArrayList  LinkedList   Vector
        * list系列集合：添加的元素是有序，可重复，有索引
        *
        * Set: HashSet  TreeSet
        * set系列集合:添加的元素是无序的不重复，无索引
        * */

        /*
        * Collection中的方法
        *   public boolean add(E e)   把给定的对象添加到当前集合中
        *   public void clear()       清空集合中的所有元素
        *   public boolean remove(E e)    把给定的对象在当前集合中删除
        *   public boolean contains(Object obj)   判断当前集合中是否包含给定的对象
        *   public boolean isEmpty()        判断当前集合是否为空
        *   public int size()               返回集合中元素的个数/集合的长度
        *
        * */

        /*
        * 注意点：
        *   Collection是一个接口，我们不能直接创建他的对象
        * 所以，我们学习的他的方法时，只能创建他实现类的对象
        * */

        Collection<Integer> coll = new ArrayList<>();
        // 添加元素
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);

        // 清空集合中的所有元素
        // coll.clear();

        // 删除
        // 注意：因为Collection里面定义的是共性的方法，所以此时不能通过索引删除，只能通过元素的对象进行删除
        coll.remove(1);

        // 是否包含该元素
        // 细节：底层是依赖 equals方法进行判断是否存在的
        // 所以，如果集合存储的是自定义对象，也想通过 contains方法来判断是否包含，那么在JavaBean类中，一定要重写equals方法
        boolean contains = coll.contains(4);
        System.out.println(contains);

        // 判断集合是否为空
        System.out.println(coll.isEmpty());

        // 查看集合的长度
        System.out.println(coll.size());

        System.out.println(coll);
    }
}
