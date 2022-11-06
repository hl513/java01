package com.xxx.day13.exam03;

public class Test {
    public static void main(String[] args) {
        // 创建对象并赋值
        Manager manager = new Manager("001","lisi",19999,2999);
        Cook cook = new Cook("002","zhansan",15999);

        System.out.println(manager.getId()+","+manager.getName()+","+manager.getBouns()+","+manager.getSalary());
        manager.eat();
        manager.work();

        System.out.println(cook.getId() + "," + cook.getName() + "," + cook.getSalary());

        cook.eat();
        cook.work();

    }
}
