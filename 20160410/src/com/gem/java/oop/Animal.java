package com.gem.java.oop;

public class Animal {
	private String name;
	private int age;
	
	public Animal(){}

	public Animal(String name){
		this.name=name;
	}
	
	public Animal(String name,int age){
		this(name);
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//Alt+shift+s,快速生成get和set方法
	
	public void Hello(){
		System.out.println("你好！");
	}
}
