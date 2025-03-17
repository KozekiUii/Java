package com.itheima.extendsdemo;

public class Test {
    public static void main(String[] args) {
        // 目标：认识继承、好处
        // 1.创建对象，封装老师数据
        // 子类可以继承父类的非私有成员
        // 子类对象是由子类和父类多张设计图共同创建出来的对象
        Teacher t = new Teacher();
        t.setName("小美");
        t.setSkill("java、前端、大数据");
        t.setSex('女');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}
