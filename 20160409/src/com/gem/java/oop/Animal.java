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
	//this���ù��췽����������Ҫ��1�������Ƿ�������ĵ�һ�У�2��thisֻ�ܵ���һ��
	
	//setter&getter
	public void setName(String name){
		//��ǰ�����name����=��ʱ����name��ֵ
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
