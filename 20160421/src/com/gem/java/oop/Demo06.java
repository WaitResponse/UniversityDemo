package com.gem.java.oop;

import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要打印的次数:");
		int j=input.nextInt();
		for(int i=1;i<=j;i++){
			System.out.println("Hello world!");
		}
		
	}
}
