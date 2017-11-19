package com.gem.java.oop;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int num=input.nextInt();
		
		
		if(num==1){
			System.out.println("数字非法，请输入一个非1的正整数：");
		}
		else {
			for(int i=2;i<=num;i++){
				boolean flag=true;	
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
			System.out.println(i+"\t");
			}
		}
		
	}
}
}