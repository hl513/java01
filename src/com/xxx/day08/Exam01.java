package com.xxx.day08;

public class Exam01 {
    public static void main(String[] args) {
        /*
        *   文字格斗游戏：
        *       格斗游戏，每个游戏角色的姓名、血量都不相同，在选定任务的时候，这些信息就应该被确定下来
        * */

        RoleExam01 r1 = new RoleExam01("乔峰",100,'1');
        RoleExam01 r2 = new RoleExam01("鸠摩智",100,'1');

        // 展示一下角色的信息
        r1.showRoleInfo();
        r2.showRoleInfo();


        // 开始格斗 回合制游戏
        while (true){
            // r1开始攻击r2
            r1.attack(r2);
            // 判断r2的血量，
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+"KO了"+r2.getName());
                break;
            }
            // r2开始攻击r1
            r2.attack(r1);
            // 判断r1的血量，
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }
        }
    }
}
