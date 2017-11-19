package com.gem.java.oop;

public class Student {
	private String sname ;
	private int age ;
	
	//setter
	public void setSname(String sn){
		if("王八".equals(sn)){
			System.out.println("姓名太霸气！");
			sname= "张三";
		}else{
			sname = sn ;
		}
	}
	public void setAge(int a){
		if(a<0 || a>200){
			System.out.println("年龄非法！");
			age = 18 ;
		}else{
			age =  a ;
		}
	}
	
	//getter
	public String getSname(){
		return sname;
	}
	public int getAge(){
		return age ;
	}
	
	
	void introduceSelf(){
		System.out.println("大家好，我是"+sname+"，今年"+age+"岁！");
	}
}

/*
我们需要做一些限制，不能让使用者"为所欲为"

属性私有、方法公开

*/