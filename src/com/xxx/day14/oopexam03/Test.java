package com.xxx.day14.oopexam03;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        BasketBallSporter ballSporter = new BasketBallSporter("小王",21);
        ballSporter.study();
        PingPangSporter pangSporter = new PingPangSporter("小李", 24);
        pangSporter.speakEnglish();
        pangSporter.study();

        BasketBallTeacher ballTeacher = new BasketBallTeacher("老李",45);
        ballTeacher.teach();
        PingPangTeacher pangTeacher  = new PingPangTeacher("老王",38);
        pangTeacher.speakEnglish();
        pangTeacher.teach();

    }
}
