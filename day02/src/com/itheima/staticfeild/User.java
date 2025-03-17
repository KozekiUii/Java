package com.itheima.staticfeild;

public class User {
    public static int count = 0;

    public User() {
//        同一个类中访问静态成员类名可以不写
        count++;
    }
}
