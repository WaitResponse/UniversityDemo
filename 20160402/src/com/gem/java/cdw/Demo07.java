package com.gem.java.cdw;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		Demo07 d=new Demo07();		
		d.add();
	}
	void add(){
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ����");
		int a=input.nextInt();
		System.out.println("������ڶ�����");
		int b=input.nextInt();
		int result=a+b;
		System.out.println(a+"+"+b+"="+result);
	}
}
