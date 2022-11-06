package com.xxx.day15.staticouter02;

public class Outer {
      /*
    int a = 10;
    static int b = 20;*/

    static class  Inner{
        public void show1(){
       /*     Outer outer = new Outer();
            System.out.println(outer.a);
            System.out.println(b);*/
            System.out.println("非静态的方法被调用了");
        }

        public static void show2(){
         /*   Outer outer = new Outer();
            System.out.println(outer.a);
            System.out.println(b);*/
            System.out.println("静态的方法被调用了");
        }
    }

}
