package com.itheima.abstract1;

public class AbstractDemo1 {
    public static void main(String[] args) {
//  抽象类的核心特点：有得有失（得到了抽象方法的能力，失去了创建对象的能力）
//  类有的成员（成员变量、方法、构造器）抽象类都具备。
//  抽象类不能创建对象（重点）,
//  A a = new A();
//  a.show();
//  抽象类的使命就是被继承
  B b = new B();
  b.show();
  b.show1();

    }
}
