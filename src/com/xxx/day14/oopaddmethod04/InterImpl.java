package com.xxx.day14.oopaddmethod04;

public class InterImpl implements Inter{

    @Override
    public void method() {
        System.out.println("强制重写的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("重写接口中的默认方法--show");
    }
}
