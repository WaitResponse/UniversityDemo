package com.gem.java.oop;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数");
		int num=input.nextInt();
		int sum=0;
		
		int i=0;
		while(i++<num){			
			sum=sum+i;	
			System.out.print(i+(i==num?"=":"+"));
		}
		System.out.print(sum);
	}
}
