package com.gem.java.访问修饰符;

public class B {
	public void hello(){
		A a = new A();
		System.out.println(a.num);//同一个包中可以访问
	}
}
