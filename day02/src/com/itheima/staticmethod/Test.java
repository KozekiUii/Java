package com.itheima.staticmethod;

public class Test {
    public static void main(String[] args) {
//      1、类名，静态方法（推荐）
        Student.printhelloworld();
//      2、对象，静态方法不推荐
        Student s1 = new Student();
        s1.printhelloworld();
//      3、对象名，实例方法
//      Student.printPass(); // 报错
        s1.setScore(100);
        s1.printPass();
//      规范：如果方法只是为了功能，不需要直接访问对象的数据，那么就可以定义为静态方法
//      如果这个方法是对象的行为，需要访问对象的数据，这个方法必须定义成实例方法
    }
}
