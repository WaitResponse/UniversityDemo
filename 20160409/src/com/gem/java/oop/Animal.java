package com.gem.java.oop;

public class Animal {
	
	private String name ;
	private int age ;
	
	public Animal(){}
	public Animal(String name){
		this.name = name ;
	}
	public Animal(int age){
		this.age = age ;
	}
	public Animal(String name , int age){
		this(name);
//		this(age);
		this.age = age ;
	}
	//this调用构造方法，有两个要求：1）必须是方法主体的第一行；2）this只能调用一次
	
	//setter&getter
	public void setName(String name){
		//当前对象的name属性=临时变量name的值
		this.name = name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
//		this.hello();
		return age ;
	}
	
	public void hello(){
		System.out.println("hello");
	}
	
}
