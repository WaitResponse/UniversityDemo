package com.gem.java.oop;

public class Demo09 {
	public static String name;
	public int age;
	public String address;
	
	public void eat(){	
		System.out.println(1);
	}
	public void run(){	
		System.out.println(2);
	}
	public void sleep(){	
		System.out.println(3);
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
