package com.gem.java.oop;
import java.util.Scanner;

public class person {
	String name;
	int height;
	int age;
	void introduce(){
		System.out.println("name:"+name);
		System.out.println("height:"+height);
		System.out.println("age:"+age);
	}
	public static void main(String[] args){
		person p=new person();
		Scanner input=new Scanner(System.in);
		
		System.out.println("����������:");
		p.name=input.next();
		
		System.out.println("���������:");
		p.height=input.nextInt();
		
		System.out.println("����������:");
		p.age=input.nextInt();
		
		p.introduce();
		
	}
}
