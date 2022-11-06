package com.xxx.day13.oop;

public class ExtendsDetail {
    /*
     *继承需要学习的点：
     *      1、什么是继承？继承的好处
     *      2、继承的特点
     *      3、子类到底能继承父类中的那些内容？
     *      4、继承中：成员变量的访问特点
     *          就近原则：谁离我近，我就用谁
     *          先在局部位置找，本类成员位置找，父类成员位置找，逐级往上
     *      5、继承中：成员方法的访问特点
     *          直接调用满足就近原则：谁离我近，我就用谁
     *          super调用，直接访问父类
     *      6、继承中：构造方法的特点
     *          父类中的构造方法不能被子类继承,但可以通过super调用
     *          子类中所有的构造方法默认先访问父类中的无参构造，再执行自己
     *          子类构造方法的第一行，有一个默认的super()
     *          如果想要方法 父类有参构造，必须手动属性
     *      7、this、super使用总结
     *          this:理解为一个变量，表示当前方法调用者的地址值
     * k        super:代表父类存储空间
     *
     * */

    public static void main(String[] args) {

        Zi zi = new Zi();
        //  就近原则，谁离的近，就用谁
        zi.ZiShow();

        zi.lunch();
    }
}


class Fu01{
    String name ="FU";

    public void eat(){
        System.out.println("吃米饭，素");
    }

    public void drink(){
        System.out.println("喝开水");
    }

}
class Zi extends Fu01{
    String name="Zi";

    // 方法的重写：
    // 应用场景：当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写
    /*
    重写方法注意事项和要求：
        1、重写方法的名称、形参列表必须与父类的中的一致
        2、子类重写父类时，访问权限子类必须大于等于父类，
        3、子类重写父类方法时，返回值类型子类必须小于等于父类
        4、建议：重写的方法尽量和父类保持一致
        5、只有被添加到虚方法表中的方法才能被重写
        6、子类不能重写父类的静态方法，如果重写会报错的
    * */
    @Override
    public void eat(){
        System.out.println("儿子，会吃饭了");
    }
    @Override
    public void drink(){
        System.out.println("儿子会喝酒了");
    }

    public void ZiShow(){
        String name = "ZiShow";
        // 局部变量
        System.out.println("就近原则:"+name);  // ZiShow
        // 子类的成员变量
        System.out.println("子类的成员变量:"+this.name); // Zi
        // 父类的变量  super关键字额可以调用 父类的成员变量和成员方法
        System.out.println("父类的成员变量:"+super.name); // FU
    }

    public void lunch(){
        // 先在本类中查看eat和drink方法，就会调用子类的，如果没有，就会调用父类中继承下列的eat和drink方法
        this.eat();
        this.drink();

        // 直接调用父类中的方法
        super.eat();
        super.drink();
    }

}