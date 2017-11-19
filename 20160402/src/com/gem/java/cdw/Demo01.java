package com.gem.java.cdw;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num=input.nextInt();
		
		if(num<=1){
			System.out.println("对不起，输入非法");
		}
		else {
			int i=2;
			while(i<=num){
				boolean flag=true;
				int j=2;
				while(j<i){
					if(i%j==0){
						flag=false;
						break;
					}
					j++;
				}
				System.out.print(flag ? (i + "\t") : "");
				i++;
			}
		}
	}

}
