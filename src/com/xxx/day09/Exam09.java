package com.xxx.day09;

public class Exam09 {
    public static void main(String[] args) {
        /*敏感词替换*/
        // String replace(旧值，新值)  替换
        // 注意点：只有返回值才是替换之后的结果

        // 1、获取到说的话
        String talk = "你玩的很好，以后不要再玩了,TMD,CNM,MLGB";
        // 2、定义一个敏感词库
        String[] arr = {"CNM", "SB", "MLGB", "TMD"};

        // 3、循环得到数组中的敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        // 打印结果
        System.out.println(talk);
    }
}
