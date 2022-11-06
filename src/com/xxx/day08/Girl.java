package com.xxx.day08;

public class Girl {
    private int age;

    /*
    * this的作用：
    *   可以区别成员变量和局部变量
    * */

    public void method(){
        int age = 10;
        // this指向的是成员变量  等号的左边：就表示成员位置的name
        System.out.println(this.age); // 0
        // 没有this，局部变量 离谁近就用谁
        System.out.println(age); // 10
    }
}
