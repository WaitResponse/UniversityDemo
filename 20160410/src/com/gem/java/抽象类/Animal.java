package com.gem.java.抽象类;

public abstract class Animal {
	public abstract void sleep();
		Animal(){
			System.out.println("默认构造方法");
		}
	//抽象方法不能有方法主体
}
