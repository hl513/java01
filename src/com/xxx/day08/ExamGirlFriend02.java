package com.xxx.day08;

public class ExamGirlFriend02 {
    public static void main(String[] args) {
        // 1、定义一个数组，用来存储女朋友对象
        GirlFriend02[] girlFriend02 = new GirlFriend02[4];
        // 2、创建女朋友对象
        GirlFriend02 girlFriend1 = new GirlFriend02("小红", 18, "萝莉", "喝奶茶");
        GirlFriend02 girlFriend2 = new GirlFriend02("小雪", 21, "御姐", "打羽毛球");
        GirlFriend02 girlFriend3 = new GirlFriend02("小蓝", 23, "女孩子", "睡觉");
        GirlFriend02 girlFriend4 = new GirlFriend02("小白", 25, "萌妹子", "吃零食");

        // 3、将女朋友对象添加到数组中
        girlFriend02[0] = girlFriend1;
        girlFriend02[1] = girlFriend2;
        girlFriend02[2] = girlFriend3;
        girlFriend02[3] = girlFriend4;


        // 遍历
        for (int i = 0; i < girlFriend02.length; i++) {
            GirlFriend02 girlFriend = girlFriend02[i];
            System.out.println(girlFriend.getGender() + "," + girlFriend.getName() + "," + girlFriend.getHobby() + ","
                    + girlFriend.getAge());
        }

        // 计算四女朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < girlFriend02.length; i++) {
            GirlFriend02 girlFriend = girlFriend02[i];
            sum = sum + girlFriend.getAge();
        }
        int avg = sum / girlFriend02.length;

        // 要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来
        for (int i = 0; i < girlFriend02.length; i++) {
            GirlFriend02 friend = girlFriend02[i];
            if (friend.getAge() < avg){
                System.out.println(friend.getGender()+","+friend.getName()+","+friend.getHobby()+
                        friend.getAge());
            }
        }

    }
}
