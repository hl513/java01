package com.xxx.api16.runtime03;

import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        /*
         * public static Runtime getRuntime()  当前系统的运行环境对象
         * public void exit(int status)  停止虚拟机
         * public int availableProcessors()  获取CPU的线程数
         * public long maxMemory()  JVM能从系统中获取总内存的大小(byte)
         * public long totalMemory()  JVM已经从系统中获取总内存的大小
         * public long freeMemory()  JVM剩余内存大小
         * public Process exec(String command)  运行cmd命令
         * */

        // 1、当前系统的运行环境对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1.equals(r2));
        // 2、停止虚拟机
//        r2.exit(0);
        // 3、获取CPU的线程数
        int process = r2.availableProcessors();
        System.out.println(process);

        // 4、JVM能从系统中获取总内存的大小(byte)
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024); // 3458MB

        // 5、JVM已经从系统中获取总内存的大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);  // 234MB

        // 6、JVM剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);  // 230MB

        // 运行cmd命令
        /*
        * shutdown ：关机
        * 加上参数才能执行：
        *   -s 默认在1分钟以后关机
        *   -s -t 指定时间 指定关机时间
        *   -a 取消关机操作
        *   -r 关机并重启
        * */
        System.out.println(Runtime.getRuntime().exec("shutdown -r"));

    }
}
