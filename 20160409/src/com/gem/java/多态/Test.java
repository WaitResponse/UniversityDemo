package com.gem.java.多态;

public class Test {
	public static void main(String[] args) {
		/*
		A a  =new A();
		System.out.println(a.num);
		*/
		/*
		B b = new B();
		System.out.println(b.num);
		*/
		
//		B b = new A();	//这句话是错误的！
		/*
		//父类类型指向子类对象
		A a = new B();
//		System.out.println(a.num);
		a.m1();
		*/
		
		Animal a = new Duck();//new Tiger();
		a.sleep();
		
	}
}

/*
父类类型指向子类对象
1.调用属性时，依据变量的类型
2.调用方法时，依据变量指向的对象的类型

多态：对于父类的一个行为，不同的子类表现出不同的形态

 */



