package com.gem.java.cdw;

import java.util.Scanner;

public class Demo09 {
	public static void main(String[] args) {
	Demo09 d=new Demo09();
	Scanner input=new Scanner(System.in);
	System.out.print("请输入第一个数:");
	int num1=input.nextInt();	
	System.out.print("请输入第二个数:");
	int num2=input.nextInt();
	System.out.print("请输入第三个数:");
	int num3=input.nextInt();
	System.out.print(d.add((d.add(num1, num2)),num3));
}
	
	int add(int num1,int num2){
		int result=num1+num2;
		return result;
		
	}
}
