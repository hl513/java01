package com.xxx.regex18;

public class RegexDem01 {
    public static void main(String[] args) {
        /*
         * 要求校验一个QQ号是否正确
         * 规则：长度6~20 0不能开头，必须全部是数字
         * */
        String qq = "123456789";
        System.out.println(checkQQ(qq));

        // 正则表达式
        boolean matches = qq.matches("[1-9]\\d{5,19}");
        System.out.println(matches);

    }

    public static boolean checkQQ(String qq) {
        // 核心思想：先把异常数据过滤，接下来就是满足要求的
        int len = qq.length();
        // 长度6~20
        if (len < 6 || len > 20) {
            return false;
        }
        // 0不能开头，
        char charAt = qq.charAt(0);
        if (charAt == '0'){
            return false;
        }

        // 必须全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }

}
