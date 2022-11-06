package com.xxx.day15.outer01;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 10;

        public void show() {
            int a = 30;
            System.out.println(Outer.this.a); // 10
            System.out.println(this.a); // 10 希望结果为 20
            System.out.println(a); // 30 就近原则
        }
    }

    public Inner getInnerStance() {
        return new Inner();
    }
}
