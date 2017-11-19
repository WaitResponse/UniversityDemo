package com.gem.java.oop;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个正数");
		int i=input.nextInt();
		if(i<=0){
			System.out.println("必须输入一个正数");
			}
			else{
				int sum=0;
				for(int j=1;j<=i;j++){							
				    sum=sum+j;
				    System.out.print(j+(j==i?"=":"+"));
				}
				System.out.println(sum);
			}
		}
	

}
