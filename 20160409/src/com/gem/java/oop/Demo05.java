package com.gem.java.oop;

public class Demo05 {
	public static void main(String[] args) {
		Student student = new Student();
		/*
		student.sname = "����";
		student.age = 29 ;
		*/
		student.setSname("����");
		student.setAge(85);
		
		System.out.println(student.getSname());
		
		student.introduceSelf() ;
	}
}
