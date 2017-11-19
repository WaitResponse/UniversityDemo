package com.gem.java.cdw;

public class People {
	String name;
	int age;
	String address;	 
	void eat(){
		System.out.println("正在吃饭");
	}
	void run(){
		System.out.println("正在奔跑");
	}
	void sleep(){
		System.out.println("正在睡觉");
	}
	void introduceSelf(){
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁，"+"来自"+address);
	}
	
	public static void main(String[] args) {
		People per=new People();
		per.name="邵伟";
	    per.age=25;
		per.address="江苏苏州";
		per.run();
		per.sleep();
		per.introduceSelf();
	}
	

}
