package com.itheima.demo;

public class Captcha {
    public static void main(String[] args) {
        System.out.println(getCaptcha(4));
    }
    public static String getCaptcha(int n){
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int)(Math.random()*3);
            switch (type){
                case 0:
                    int num = (int)(Math.random()*10);
                    code += num;
                    break;
                case 1:
                    char ch = (char)(Math.random()*26+'a');
                    code += ch;
                    break;
                case 2:
                    char ch1 = (char)(Math.random()*26+'A');
                    code += ch1;
                    break;
            }
        }
        return code;
    }
}
