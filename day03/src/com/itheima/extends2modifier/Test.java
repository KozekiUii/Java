package com.itheima.extends2modifier;

public class Test {
    public static void main(String[] args) {
        //    认识四种权限修饰符的修饰范围
        Fu fu = new Fu();
//      fu.privateMethod(); // 私有方法，只能在其本类中访问
        fu.publicMethod();
        fu.protectedMethod();
        fu.defaultMethod();

    }

}
