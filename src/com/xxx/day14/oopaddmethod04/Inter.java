package com.xxx.day14.oopaddmethod04;

@SuppressWarnings("all")
public interface Inter {

    /*接口中默认方法的定义格式：
     *               格式：public default 返回值类型 方法名(参数列表)
     *               规范： public default void show(){  }
     *         接口中默认方法的注意事项：
     *               默认方法不是抽象方法，所以不强制重写，重写的的时候去掉 default关键字
     *               public可以省略，default不能省略
     *               如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
     */

    //  默认方法不是抽象方法，所以不强制重写，重写的的时候去掉 default关键字
    public default void show(){
        System.out.println("接口中的默认方法……show");
    }

    public void method();

}
