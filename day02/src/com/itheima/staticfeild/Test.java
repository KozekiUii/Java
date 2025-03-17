package com.itheima.staticfeild;

public class Test {
    public static void main(String[] args) {
        new User();
        new User();
        new User();

        System.out.println(User.count);
    }
}
