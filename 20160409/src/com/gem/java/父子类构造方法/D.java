package com.gem.java.父子类构造方法;

public class D extends C{
	public D(){
		super("jim");//指定调用父类的有参构造方法
		System.out.println("D的构造方法");
	}
}
