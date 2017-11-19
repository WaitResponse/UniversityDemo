package com.gem.java.多态;

public class Test {
	public static void main(String[] args) {
/*		A a=new A();
		System.out.println(a.num);
		
		
		B b=new B();
		b.m1();
		*/
		
		//B b=new A();这句话是错误的，子类对象不能指向父类方法
  
		A a=new B();
		System.out.println(a.num);
		a.m1();
	}
}