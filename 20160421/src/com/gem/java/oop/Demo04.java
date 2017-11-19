package com.gem.java.oop;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份:");
		int year=input.nextInt();
		
		System.out.println("请输入月份:");
		int month=input.nextInt();
		
		int day=1;
	
	
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day=30;
			break;
		case 2:
			day=((year%4==0&&year%100!=0||year%400==0))?29:28;
					break;
					}
		System.out.println("今天是"+year+"年"+month+"月，"+"有"+day+"天");
		
	}
}
					
		
			
			

		
		
		
		
