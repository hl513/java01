package com.xxx.day15.anonymousinner04;

public class AnonymousDetail {
    /*
     * 匿名内部类：
     *       匿名内部类本质上就是隐藏了名字的内部类
     *       格式：
     *            new 类名或者接口名(){
     *                   重写方法
     *            };
     *       格式的细节：
     *             包含了继承或实现、方法重写、创建对象
     *       应用场景：
     *           当方法的参数是接口或者类时
     *
     * */
    public static void main(String[] args) {

        // 匿名内部类
        new Swim() {
            @Override
            public void swim() {
                System.out.println("匿名内部类的方法^");
            }
        };
    }
}
