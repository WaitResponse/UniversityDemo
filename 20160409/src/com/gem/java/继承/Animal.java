package com.gem.java.¼Ì³Ð;

//¸¸Àà
public class Animal {
	private String name;
	private int age;

	public void hello(){
		System.out.println("Animal hello...");
	}
	
	public void run() {
		System.out.println("run....");
	}

	public void sleep() {
		System.out.println("Å¿×ÅË¯...");
	}

	public void eat() {
		System.out.println("eat...");
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
}
