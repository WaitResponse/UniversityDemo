package com.gem.java.oop;

public class Tiger {
	private String tname ;
	private int age ;
	private String address ;
	
	public Tiger(){}

	public Tiger(String tname) {
		this.tname = tname;
	}

	public Tiger(String tname, int age, String address) {
		this.tname = tname;
		this.age = age;
		this.address = address;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
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
//alt+shift+S