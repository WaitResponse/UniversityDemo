package com.gem.java.cdw;

import java.util.Scanner;

public class YUju {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//ctrl+shift+o�Զ������
		System.out.print("����������:");
		String name=input.next();
		System.out.print("����������:");
		int age=input.nextInt();
		
		if(age<8){
		System.out.println(name+"С�������");
	}
	}
}
