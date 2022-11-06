package com.xxx.day15.localInner03;

public class LocalInnerDetail {

    /*
    * 局部内部类
    *   1、将内部类定义在方法里面就做局部内部类，类似于方法里面的局部变量
    *   2、外界是无法直接使用的，需要在方法内部创建对象并使用
    *   3、该类可以直接访问外部类的成员，也可以访问方法内的局部变量
    * */
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.show();

    }
}
