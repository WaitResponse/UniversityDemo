package com.gem.java.关键字final;

public class B extends A{
	public void m1(){}
	public void m2(){}	//此处报错，因为m2是一个final方法,不可被重写
}
