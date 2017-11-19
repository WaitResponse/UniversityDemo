package com.gem.java.oop;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		Demo05 d=new Demo05();
	Scanner input=new Scanner(System.in);
	System.out.print("请输入数字：");
	int number=input.nextInt();
	System.out.print("请输入位数：");
	int length=input.nextInt();
	int sum=0;
	
	for(int i=1;i<=length;i++){
		int num=d.getNumber(number,i);
		sum=sum+num;
		System.out.print(num+((i==length)?"=":"+"));
	}
	System.out.print(sum);
	}
	
	int getNumber(int number,int length){
		if(length==1){
			return number;
		}else{
			return getNumber(number,length-1)*10+number;
		}
	}
}

