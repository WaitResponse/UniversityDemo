package com.gem.java.oop;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入行号：");
		int count=input.nextInt();
		
		for(int i=1;i<=count;i++){
		for(int j=1;j<=count-i;j++){
			System.out.print(" ");
			}//打印空格		
		for(int j=1;j<=i*2-1;j++){
			System.out.print("*");
		}//打印*号
			
			System.out.println();
	}
}
}