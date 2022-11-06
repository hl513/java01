package com.xxx.day09;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        /*需求
        *   已知正确的用户名和密码，请用程序实现模拟用户登录
        *   总共给三次机会，登录之后，给出相应的提示
        * */

        // 定义正确的用户名和密码
        UserLogin userLogin = new UserLogin();
        userLogin.setName("zhangsan");
        userLogin.setPassword("123456");

        // 键盘输入用户名，密码
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入用户名:");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (name.equals(userLogin.getName()) && password.equals(userLogin.getPassword())){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("用户名或者密码错误，请重新输入,还有"+(i-1)+"次机会");
            }
        }
    }
}
