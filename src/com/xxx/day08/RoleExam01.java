package com.xxx.day08;

import java.util.Random;

public class RoleExam01 {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"风流倜傥", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材娇好", "相貌平平", "相貌丑陋", "惨不忍睹"};


    String[] attacks_desc = {
            "%s 使出了一招【背心钉】，转到对方的身后，一掌向%s 背心的灵台穴拍去。",
            "%s 使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s 大喝一声，身形下伏，一招【劈雷坠地】，捶向%s 双腿。",
            "%s 运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s 阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s 上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    String[] injureds_desc = {
            "结果%s 退了半步，毫发无损",
            "结果给%s 造成一处瘀伤",
            "结果一击命中，%s 痛得弯下腰",
            "结果%s 痛苦地闷哼了一声，显然受了点内伤",
            "结果%s 摇摇晃晃，一跤摔倒在地",
            "结果%s 脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s 口中鲜血狂喷而出",
            "结果%s 一声惨叫，像滩软泥般塌了下"
    };

    public RoleExam01() {
    }

    public RoleExam01(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        // 随机长相
        setFace(gender);
    }


    // 定义一个方法用于攻击别人
    // 思考：谁攻击谁
    // Role r1 = new Role()
    // Role r2 = new Role()
    // r1.攻击(r2)
    // 方法的调用者去攻击参数
    public void attack(RoleExam01 role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String Kungfu = attacks_desc[index];
        // 输出一个攻击的效果
        System.out.printf(Kungfu, this.getName(), role.getName());
        System.out.println();

        // 计算造成的伤害 1~20
        int hurt = r.nextInt(20) + 1;
        // 剩余血量
        int remainBlood = role.getBlood() - hurt;
        // 对剩余血量做一个验证，如果为负数了，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // 修改游戏挨揍的人的血量
        role.setBlood(remainBlood);

        // 受伤描述
        // 剩余血量 > 90  0索引的描述
        // 80~90 1索引的描述
        // 70~80 2索引的描述
        // 60~70 3索引的描述
        // 40~60 4索引的描述
        // 20~40 5索引的描述
        // 10~20 6索引的描述
        //  小于10     7索引的描述
        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood > 80) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (remainBlood > 70) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (remainBlood > 60 && remainBlood < 70) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (remainBlood > 40 && remainBlood < 60) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (remainBlood > 20 && remainBlood < 40) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (remainBlood > 10 && remainBlood < 20) {
            System.out.printf(injureds_desc[6], role.getName());
        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        // 长相是随机的
        if (gender == '1') {
            // 从boyfaces里面随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '0') {
            // 从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }

    public String[] getBoyfaces() {
        return boyfaces;
    }

    public void setBoyfaces(String[] boyfaces) {
        this.boyfaces = boyfaces;
    }

    public String[] getGirlfaces() {
        return girlfaces;
    }

    public void setGirlfaces(String[] girlfaces) {
        this.girlfaces = girlfaces;
    }


    // 展示用户的所有角色信息
    public void showRoleInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别为:" + getGender());
        System.out.println("长相为:" + getFace());
    }
}
