package com.gem.java.oop;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������кţ�");
		int count=input.nextInt();
		
		for(int i=1;i<=count;i++){
		for(int j=1;j<=count-i;j++){
			System.out.print(" ");
			}//��ӡ�ո�		
		for(int j=1;j<=i*2-1;j++){
			if(i<10){
				System.out.print(i);
			}
				else{
					System.out.print((char)(i+55));
				}
			}//��ӡ�Ǻ�
		System.out.println();
		}						
	}
}

