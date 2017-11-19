package com.gem.java.访问修饰符protected;

public class Demo01 {
	public static void main(String[] args) {
		/*
		A a = new A();
		//实例方法必须通过实例引用变量进行调用
		a.m1();
		
//		new A().m1();
		
		//静态方法可以通过类名直接调用
		A.m2();
		*/
		
		/*
		B b1 = new B();
		b1.num1 = 9 ;
		System.out.println(b1.num1);
		
		B b2 = new B();
		System.out.println(b2.num1);
		//没创建一个实例对象，其中的实例变量都会自带一份，互不影响
		*/
		
		B b1 = new B();
		B b2 = new B();
		b1.num2 = 9 ;
		System.out.println(b2.num2);
		System.out.println(B.num2);
		
		
	}
	
	
}
/*







*/
