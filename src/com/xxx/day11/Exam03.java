package com.xxx.day11;

import java.util.ArrayList;

public class Exam03 {
    public static void main(String[] args) {
        /*需求：添加用户并判断是否存在
               1、main方法中定义一个集合，存入三个用户对象
                    用户属性为：id,userName,passWord
               2、要求：定义一个方法，根据id查找对应的用户信息
               如果存在，返回true
               如果不存在，返回false
        * */
        // 定义一个集合
        ArrayList<User> list = new ArrayList<>();
        // 创建用户对象
        User user1 = new User(1,"张三","123456");
        User user2 = new User(2,"李四","123321");
        User user3 = new User(3,"王五","12345678");

        // 将用户对象添加到集合中
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // 定义方法，根据id查找对应的用户信息
        boolean flag = queryId(list, 1);
        System.out.println(flag);

    }

    public static boolean queryId(ArrayList<User> list,int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
