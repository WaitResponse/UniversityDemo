package com.gem.java.�̳�;

public class B extends A{
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.name);
		System.out.println(b.age);
		b.eat();
		b.Sleep();
		b.eat();
		
	}
	void eat(String name){
		super.eat();
	 System.out.println("վ�ųԷ�");
	}
	void Sleep(){
	 System.out.println("վ��˯��");
	}
}
