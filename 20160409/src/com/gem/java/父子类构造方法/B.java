package com.gem.java.父子类构造方法;

public class B extends A{
	public B(){
		super();//调用父类的默认构造方法
		System.out.println("B的默认构造方法");
	}
}
