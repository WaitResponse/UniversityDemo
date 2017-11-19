package com.gem.java.cdw;

import java.util.Scanner;

public class YUju {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//ctrl+shift+o自动导入包
		System.out.print("请输入姓名:");
		String name=input.next();
		System.out.print("请输入年龄:");
		int age=input.nextInt();
		
		if(age<8){
		System.out.println(name+"小朋友你好");
	}
	}
}
