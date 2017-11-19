package com.gem.java.¼Ì³Ð;

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
	 System.out.println("Õ¾×Å³Ô·¹");
	}
	void Sleep(){
	 System.out.println("Õ¾×ÅË¯¾õ");
	}
}
