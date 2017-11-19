package com.gem.java.IOÁ÷;

import java.io.Serializable;



public class Person implements Serializable {
	private String name;
	private String detail;
	private int age;
	
	Person(){}

	public Person(String name, String detail, int age) {
		super();
		this.name = name;
		this.detail = detail;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", detail=" + detail + ", age=" + age
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
