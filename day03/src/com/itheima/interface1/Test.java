package com.itheima.interface1;

/**
 * @author Komoribi
 * @version 1.0
 * @description: TODO
 * @date 2025/3/16 14:45
 */
public class Test {
	public static void main(String[] args) {
	// 	目标：认识接口，搞清楚接口的特点，基本使用。
	// 	接口是用来被类实现的，不能创建接口对象。
		System.out.println(A.SCHOOL_NAME);
		C c = new C();
		c.go();
		c.run();
		c.play();
	}
}
// C 被称为实现类，同时实现多个接口，A、B 被称为接口
// 实现类实现多个按口，必须重写完全部接口的全部抽象方法，否则这个类必须定义成抽象类
class C implements A,B{
	@Override
	public void run() {
		System.out.println("C类重写了run方法");
	}

	@Override
	public String go() {
		return "黑马程序员";
	}

	@Override
	public void play() {
		System.out.println("C类重写了play方法");
	}
}