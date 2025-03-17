package com.itheima.staticmethod;

public class Test2 {
    public static void main(String[] args) {
//      开发一个验证码程序，生成 n 位验证码
        String code = VerifyCodeUtil.getCaptcha(4);
        System.out.println(code);
    }
}
