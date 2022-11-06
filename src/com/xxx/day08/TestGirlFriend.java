package com.xxx.day08;

public class TestGirlFriend {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小红");
        gf1.setAge(18);
        gf1.setGender("萌妹子");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();

    }
}
