package com.xxx.day14.oopexam03;

public class BasketBallSporter extends Sporter{

    public BasketBallSporter() {
    }

    public BasketBallSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }

}
