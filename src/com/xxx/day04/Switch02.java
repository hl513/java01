package com.xxx.day04;

@SuppressWarnings("all")
public class Switch02 {
    public static void main(String[] args) {
        String noodles = "兰州拉面";

        switch (noodles) {
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("请重新选择菜品");
                break;
        }
    }
}
