package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Fu;
// 继承了父类Fu，所以Zi类可以访问到Fu类中的public和protected修饰的方法和属性
public class Zi extends Fu{
    public void show(){
        publicMethod();
        protectedMethod();
    }
}
