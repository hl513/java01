package com.xxx.exam12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("-----------------欢迎来到学生管理系统----------------");
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、查询学生");
            System.out.println("5、退出系统");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    delStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.exit(0); // 停止虚拟机运行
                    break;
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }

    }

    // 添加功能
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        int id;
        // 利用空参构造创建学生对象
        Student stu = new Student();
        System.out.println("请输入学生的id");
        while (true) {
            id = sc.nextInt();
            boolean flag = contains(list, id);
            if (flag) {
                // 表示id已经存在，需要重新输入
                System.out.println("id已经存在，请重新输入");
            } else {
                // 表示id不存在，表示可以使用
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生的年龄:");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生的地址:");
        String address = sc.next();
        stu.setAddress(address);

        // 把学生对象添加到集合中
        list.add(stu);

        System.out.println("学生信息添加成功!");

    }


    // 删除功能
    public static void delStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id");
        int id = sc.nextInt();

        // 判断id是否存在，进行提示
        // 查询id在集合中的索引
        int index = getIndex(list, id);
        // 对index进行判断
        if (index >= 0){
            // 如果大于等于0，表示存在，直接删除
            list.remove(index);
            System.out.println("id为"+id+"的学生删除成功");
        }else{
            // 如果不存在，返回主页
            System.out.println("id不存在，删除失败！");
        }
    }


    // 修改功能
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的id");
        int id = sc.nextInt();

        // 判断id是否存在，存在再进行修改，不存在则进行提示
        int index = getIndex(list, id);
        // 如果id存在，则重新设置值
        if (index == -1){
            System.out.println("要修改的id："+id+"不存在，请重新输入");
            return;
        }
        // 表示当前id存在
        Student stu = list.get(index);
        System.out.println("请输入要修改的姓名:");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄:");
        int  newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

    /*    // 将学生对象添加到集合中
        list.add(stu);
*/
        System.out.println("修改学生信息成功");
    }

    // 查询功能
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询");
            // 结束方法
            return;
        }
        // 打印表头
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        // 当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    // 判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, int id) {
        // 循环遍历集合得到里面的每一个学生对象
        // 拿到学生对象后，获取id，并进行判断
      return getIndex(list,id) >= 0;
    }
    //  通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list,int id){
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 得到每一个学生对象
            Student stu = list.get(i);
            // 得到每一个学生对象的id
            int sid = stu.getId();
            // 拿着集合中的学生id跟要删除的id进行比较
            if (sid == id){
                // 如果一样，那么就返回索引
                return i;
            }
        }
        return -1;
    }
}
