package com.gem.java.cdw;

import java.util.Scanner;

public class Demo09 {
	public static void main(String[] args) {
	Demo09 d=new Demo09();
	Scanner input=new Scanner(System.in);
	System.out.print("�������һ����:");
	int num1=input.nextInt();	
	System.out.print("������ڶ�����:");
	int num2=input.nextInt();
	System.out.print("�������������:");
	int num3=input.nextInt();
	System.out.print(d.add((d.add(num1, num2)),num3));
}
	
	int add(int num1,int num2){
		int result=num1+num2;
		return result;
		
	}
}
