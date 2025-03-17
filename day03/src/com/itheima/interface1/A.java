package com.itheima.interface1;

public interface A {
	// 1、接口中定义的成员变量，默认是public static final修饰的
	// public static final int NUM = 10;
	String SCHOOL_NAME = "黑马程序员";
	// 2、抽象方法：接口中定义抽象方法可以省略 public abstract关键字
	// public abstract void run();
	void run();
	String go();
}
