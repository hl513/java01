package com.xxx.day15;

public class Car {
     String carName;
     int  carAge;
     String carColor;
     public void show(){
         // 打印调用者车的名字：宾利
         System.out.println(this.carName);
         //  外部类要访问内部类的成员，必须创建对象
         Engine engine = new Engine();
         System.out.println(engine.engineName);
     }

     class Engine{
         String engineName;
         int engineAge;

         public void show(){
             System.out.println(engineName);
             // 内部类可以直接访问外部类的成员，包括私有
             System.out.println(carName);
         }
     }

}
