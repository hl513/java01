package com.xxx.day14.oopaddmethod04;

@SuppressWarnings("all")
public class AddMethodDetail {
    /*
     * JDK8开始接口中新增的方法
     *       JDK7以前：接口中只能定义抽象方法
     *
     *       JDK8的新特性：接口中可以定义有方法体的方法
     *           允许在接口中定义默认方法，需要使用关键字 default修饰
     *           作用：解决接口升级的问题
     *         接口中默认方法的定义格式：
     *               格式：public default 返回值类型 方法名(参数列表)
     *               规范： public default void show(){  }

     *         接口中默认方法的注意事项：
     *               默认方法不是抽象方法，所以不强制重写，重写的的时候去掉 default关键字
     *               public可以省略，default不能省略
     *               如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
     *
     *         允许在接口中定义静态方法，需要用static修饰
     *               格式：public static 返回值类型 方法名(参数列表) { }
     *               范式：public static void show() {  }
     *          接口中静态方法的注意事项：
     *                静态方法只能通过接口名调用，不能通过实现类名或对象名调用
     *                public 可以省略，static不能省略
     *
     *       JDK9的新特性：接口中可以定义私有方法
     * */
    public static void main(String[] args) {
        // 创建实现类的对象
        InterImpl inter = new InterImpl();
        // 可以调用强制重写的方法
        inter.method();
        // 也可以调用用default修饰的方法
        inter.show();
        // 允许在接口中定义静态方法，需要用static修饰
        //  静态方法只能通过接口名调用，不能通过实现类名或对象名调用
        // 调用接口中的静态方法
        StaticInter.show();
    }

}
