package com.gem.java.cdw;

import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		String name1;
		String name2;
		Demo06 d=new Demo06();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入姓名");
		name1=input.next();
		System.out.println("请输入姓名");
		name2=input.next();
		d.introduce(name1,name2);
	}
		void introduce(String name1,String name2){
			System.out.println("你好"+name1+"and"+name2);
		}
	}


