package com.xxx.day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        /*双色球系统
         *   投注号码由个6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择
         *   蓝色求号码从1-16中选择
         */

        // 1、生成中将号码
        int[] arr = createNumber();
        System.out.println(Arrays.toString(arr));

        // 2、用户输入彩票号码 （红球 + 蓝球）
        int[] userInputArr = userInputNumber();

        // 3、将中将号码与用户输入彩票号码对比，并判断是几等奖
        // 红球、蓝球
        int redCount = 0;
        int blueCount = 0;

        // 判断红球
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    // 如果找到了，那么后面的数字就没有必要继续比较了
                    // 跳出内循环，继续判断下一个红球号码是否中将
                    break;
                }
            }
        }

        // 判断蓝球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
        System.out.println(redCount);
        System.out.println(blueCount);

        // 判断中将情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中一等奖(1000w)");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，二等奖(500w)");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，三等奖(3000)");
        } else if ((redCount == 4 && blueCount == 1) || (redCount == 5 && blueCount == 0)) {
            System.out.println("恭喜你,四等奖(200)");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你,五等奖(10)");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || blueCount == 1) {
            System.out.println("恭喜你,六等奖(5)");
        } else {
            System.out.println("谢谢参与");
        }
    }

    // 生成中将号码
    public static int[] createNumber() {
        // 1、创建数组用于添加中将号码
        // 6个红色，1个蓝球，数组长度 ： 7
        int[] arr = new int[7];

        // 2、随机生成号码，并添加到数组当中
        // 红球号码不能重复，蓝球号码可以和红球号码重复

        // 生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            // 获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                // 把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }
        //生成篮球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    // 用于判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    // 用户输入购买的彩票号码
    public static int[] userInputNumber() {
        // 1、创建数组用于添加用户购买的彩票号码
        // 6个红球  1个蓝球 数组长度 ：7
        int[] arr = new int[7];
        // 利用键盘录入
        Scanner sc = new Scanner(System.in);
        // 让用户输入红球号码
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            // redNumber 在1~33之中，唯一不重复
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    // 不存在
                    // 有效的，可以添加到数组当中
                    arr[i] = redNumber;
                } else {
                    System.out.println("当前红球号码已经存在，请重新输入");
                }
            } else {
                System.out.println("当前红球号码超出范围");
            }
        }
        // 让用户输入蓝球
        System.out.println("请输入蓝球号码:");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 0 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arr;
    }
}
