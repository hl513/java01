package com.xxx.exam12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请输入选择 :1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(list);
                    break;
                case "2":
                    register(list);
                    break;
                case "3":
                    forgetPassWord(list);
                    break;
                case "4":
                    System.out.println("谢谢使用,bye");
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    // 忘记密码
    private static void forgetPassWord(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        boolean flag = contains(list, userName);
        if (!flag) {
            System.out.println("当前用户：" + userName + "不存在，请先注册");
            return;
        }
        // 用户名存在，键盘录入身份证号码和手机号码
        System.out.println("请输入身份证号码:");
        String card = sc.next();
        System.out.println("请输入手机号码:");
        String phoneNumber = sc.next();


        // 需要把用户对象通过索引先获取出来
        int index = findIndex(list,userName);
        User user = list.get(index);

        // 比较用户对象中的手机号码和身份证号码是否相同
        if (!(user.getCard().equalsIgnoreCase(card) && user.getPhoneNumber().equals(phoneNumber))){
            System.out.println("身份证号码或手机号码输入有误，不能修改密码!");
            return;
        }

        // 当代码执行到这里，表示所有的数据全部验证成功，直接修改即可
        String newPassWord;
        while (true) {
            System.out.println("请输入新的密码：");
            newPassWord = sc.next();
            System.out.println("请再次输入新的密码:");
            String newPassWord2 = sc.next();
            if (newPassWord2.equals(newPassWord)){
                System.out.println("两次密码输入一致");
                break;
            }else{
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
        }

        // 直接修改即可
        user.setPassWord(newPassWord);

    }
    // 将对象获取出来
    private static int findIndex(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
           User user = list.get(i);
           if (user.getUserName().equals(userName)){
               return i;
           }
        }
        return -1;
    }

    // 注册功能
    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String userName;
        String passWord;
        String card;
        String phoneNumber;
        //1、 键盘录入用户名
        while (true) {
            System.out.println("请输入用户名:");
            userName = sc.next();
            boolean flag = checkUserName(userName);
            if (!flag) {
                System.out.println("用户名格式不正确，需要重新输入");
                continue;
            }

            // 用户名唯一
            // userName到集合中判断是否有存在的
            boolean flag2 = contains(list, userName);
            if (flag2) {
                // 用户名已存在，那么当前用户名无法注册，需要重新输入
                System.out.println("用户名:" + userName + "已存在，请重新输入");
                continue;
            } else {
                // 不存在，表示当前用户名可用，可以录入其他的功能
                System.out.println("用户名:" + userName + "可用");
                break;
            }
        }

        // 2、键盘录入密码
        while (true) {
            System.out.println("请输入要注册的密码:");
            passWord = sc.next();
            System.out.println("请再次输入要注册的密码:");
            String againPassWord = sc.next();

            if (!passWord.equals(againPassWord)) {
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            } else {
                System.out.println("两次密码一致，继续录入其他数据");
                break;
            }
        }

        // 3、键盘录入身份证号码
        while (true) {
            System.out.println("请输入身份证号码:");
            card = sc.next();
            boolean flag = checkCard(card);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误，请重新输入");
                continue;
            }
        }

        // 4、键盘录入手机号码
        while (true) {
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误，请重新输入");
                continue;
            }
        }

        // 用户名、密码、身份证号码、手机号码放到用户对象中
        User user = new User(userName, passWord, card, phoneNumber);
        list.add(user);
        System.out.println("注册成功");

        // 遍历集合
        printList(list);

    }

    // 登录功能
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            // 键盘录入用户名
            String userName = sc.next();
            // 判断用户名是否存在
            boolean flag = contains(list, userName);
            if (!flag) {
                System.out.println("用户名" + userName + "未注册，请先注册再登录");
                return;
            }

            // 键盘录入密码
            System.out.println("请输入密码!");
            String passWord = sc.next();

            // 键盘录入验证码
            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确的验证码为:" + rightCode);
                System.out.println("请输入验证码:");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误");
                    continue;
                }
            }
            // 判断用户名和密码是否正确
            // 判断集合中是否包含用户名和密码
            // 封装思想：把一些零散的数据，封装成一个对象
            User userInfo = new User(userName, passWord, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登录成功，可以开始使用学生管理系统");
                break;
            } else {
                System.out.println("登录失败，用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前账号:" + userName + "已被锁定，请联系客服");
                    // 当前账号锁定之后，直接结束方法即可
                    return;
                } else {
                    System.out.println("用户名或密码错误，还剩下" + (2 - i) + "次机会");
                }
            }
        }

    }

    //  定义一个方法验证用户名和密码是否正确
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        // 遍历集合，判断用户是否存在，如果存在登录成功，如果不存在，登录失败
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUserName().equals(userInfo.getUserName()) && user.getPassWord().equals(userInfo.getPassWord())) {
                return true;
            }
        }
        return false;
    }

    // 手机号码验证
    private static boolean checkPhoneNumber(String phoneNumber) {
        //  长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //  不能以0开头
        char c = phoneNumber.charAt(0);
        if (c == '0') {
            return false;
        }
        //  必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            // i索引
            char charAt = phoneNumber.charAt(i);
            if (!(charAt >= '0' && charAt <= '9')) {
                return false;
            }
        }
        return true;
    }

    // 身份证号码验证
    private static boolean checkCard(String card) {
        // 长度为18位
        int len = card.length();
        if (len != 18) {
            return false;
        }
        // 不能以0为开头
        boolean flag = card.startsWith("0");
        if (flag) {
            // 如果以0开头，返回false
            return false;
        }
        // 前17位，必须都是数字
        for (int i = 0; i < card.length() - 1; i++) {
            char c = card.charAt(i);
            // 如果有一个字符不在 0~9之间，直接返回false
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        // 最后一位可以是数字，也可以是大写或小写x
        char endChar = card.charAt(card.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    // 校验用户名唯一
    private static boolean contains(ArrayList<User> list, String userName) {
        // 循环遍历集合得到每一个用户对象
        // 将用户对象与我们输入的用户名进行比较
        for (int i = 0; i < list.size(); i++) {
            // i索引
            User user = list.get(i);
            String rightUserName = user.getUserName();
            if (rightUserName.equals(userName)) {
                return true;
            }
        }
        // 循环结束，表示集合里面所有的用户都比较完毕，还没有重复的
        return false;
    }

    // 用户名的校验
    private static boolean checkUserName(String userName) {
        // 长度校验
        // 验证：用户名长度必须在3~15之间
        int len = userName.length();
        if (len < 3 || len > 15) {
            return false;
        }
        // 当代码执行到这里，表示用户名的长度符合要求
        // 只能是数字加字母的组合，但不能是纯数字
        for (int i = 0; i < userName.length(); i++) {
            // i所引
            char c = userName.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        // 当代码执行到这里，说明用户名满足上面的条件 长度满足、内容满足
        // 不能是纯数字
        // 统计在用户名中，有多少字母就可以了
        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            // i所引
            char c = userName.charAt(i);
            if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                count++;
                // 当有一个满足的时候，就直接结束
                break;
            }
        }
        return count > 0;
    }

    // 遍历集合
    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.toString());
        }
    }

    // 随机生成验证码
    public static String getCode() {
        //  长度为5
        //  由4位大写或小写和1位数字组成，同一个字母可重复
        //  数字可以出现在任意位置
        // 1、创建一个集合添加所有的大写字母和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            // 添加大写字母和小写字母s
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        // 2、随机抽取4个字符
        Random random = new Random();
        // 获取随机索引
        int index = random.nextInt(list.size());
        // 利用随机索引获取随机字符
        Character character = list.get(index);
        // 把随机字符添加到sb中
        sb.append(character);

        // 3、把一个随机数字添加到末尾
        int number = random.nextInt(10);
        sb.append(number);

        // 4、如果我们要修改字符串中的内容
        // 先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] chars = sb.toString().toCharArray();
        // 拿着随机索引跟着最后一个索引进行交换
        int randomIndex = random.nextInt(chars.length);
        // 最大索引指向的元素，跟随机索引指向的元素进行交换
        char temp = chars[randomIndex];
        chars[randomIndex] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        return new String(chars);
    }
}
