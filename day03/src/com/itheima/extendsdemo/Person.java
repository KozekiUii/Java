package com.itheima.extendsdemo;
// 父类
// 继承的好处：减少代码量，提高代码的复用性
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    private String name;
    private char sex;
}
