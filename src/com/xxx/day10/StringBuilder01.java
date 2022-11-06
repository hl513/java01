package com.xxx.day10;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        * StringBuilder 可以看成一个容器，创建之后里面的内容是可变的
        * 作用：提高字符串的操作效率
        *
        * 成员方法：
        *      public StringBuilder append(任意类型)  添加数据，并返回对象本身
        *      public StringBuilder reverse()   反转容器中的内容
        *      public int length()  返回长度(字符出现的个数)
        *      public String toString()  通过toString() 就可以实现把StringBuilder转换成String
        * */

        // 创建对象
        StringBuilder sb = new StringBuilder("abc");

        // 添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        // 将容器里面的内容进行反转
        sb.reverse();

        // 获取长度
        int len = sb.length();
        System.out.println(len);

        // 打印
        // 因为StringBuilder是java已经写好的类，打印对象不是地址值而是属性值
        System.out.println(sb);

    }
}
