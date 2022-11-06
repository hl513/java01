package com.xxx.day13.polymorphism06;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Animal a  = new Dog();
        Animal b = new Cat();
        // 编译看左边，运行看右边
        a.eat();

        // 多态的弊端
        // 不能调用子类特有功能
        // a.say();

        // 解决方法
        // 变回子类类型就可以了
        // 细节：转换的时候不能瞎转，如果转成其他类的类型，就会报错
        Dog d = (Dog)a;
        d.say();

        // 在类型转换之前，转换关键字  变量名 instanceof()  类名
        if (b instanceof Cat){
            Cat c = (Cat)b;
            c.say();
        }else if (b instanceof  Dog){
            Dog e = (Dog)b;
            e.say();
        }else{
            System.out.println("没有这个类型，无法转换");
        }

        // JDK14新特性： 先判断 b 是否为 Cat类型，如果是，则强转成Cat类型，转换之后变量名为 c
        // 如果结果不是，则不强转，结果直接是false
      /*  if (b instanceof Cat c){
            c.say();
        }else if (b instanceof Dog d1){
            d1.say();
        }else {
            System.out.println("没有这个类型，无法转换");
        }*/

    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
    public void say(){
        System.out.println("狗的叫声,汪汪汪");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫在吃鱼干");
    }
    public void say(){
        System.out.println("猫的叫声,喵喵喵");
    }
}