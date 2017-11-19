package com.gem.java.oop;

import java.util.Comparator;

public class Student  {
	String name;
	int age;
	int number;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", number=" + number
				+ "]";
	}
	
	public Student(){}
	
	public Student(String name, int age, int number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
