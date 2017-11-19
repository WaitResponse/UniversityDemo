package com.gem.java.oop;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num=input.nextInt();
		
		if(num==1){
			System.out.println("输入的数字非法，请输入一个非1的整数");
		}else{	
		for(int i=2;i<=num;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
			if(i%j==0){
				flag=false;
				break;
			}
			}
			if(flag){
		System.out.print(i+"\t");
		}
			
		}
		}
	}
}
		
	
