package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Fu;

public class Demo {
    public static void main(String[] args) {
        Fu fu = new Fu();
//        fu.privateMethod();   // 只能本类
//        fu.defaultMethod();   // 只能本包、本类
//        fu.protectedMethod(); // 只能本包、本类、子类
        fu.publicMethod();
    }
}
