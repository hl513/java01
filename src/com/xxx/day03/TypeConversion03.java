package com.xxx.day03;

// 类型转换
public class TypeConversion03 {
    public static void main(String[] args) {
        /*
        * 隐士转换 （自动类型提升）
            把一个 取值范围小 的数值，转换成 取值范围大 的数据

          强制转换
            把一个 取值范围大 的数值，转换成 取值范围小的 数据

          byte short char 这几种类型的在进行运算时，会自动提升为 int 类型的
             */
        int a = 10;
        double b = a+20;
        System.out.println(b);

        // 强制转换  目标数据类型 变量名 = (需要转换的类型)变量名
        double  i = 10;
        int j = 20;
        int num = j + (int)i;
        System.out.println(num);
    }
}
