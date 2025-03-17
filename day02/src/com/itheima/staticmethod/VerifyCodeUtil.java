package com.itheima.staticmethod;
//  静态方法设计工具类
//  功能：生成 n 位验证码
public class VerifyCodeUtil {
//  构造器私有
//  工具类没有创建对象的必要性，所以建议私有化构造器，阻止实例化
    private VerifyCodeUtil(){
    }
    public static String getCaptcha(int n){
        String code = "";
        for (int i = 0; i < n; i++) {
//  0：随机数字；1：随机小写字母；2：随机大写字母
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
