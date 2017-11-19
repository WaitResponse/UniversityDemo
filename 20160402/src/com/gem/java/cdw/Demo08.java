
package com.gem.java.cdw;

import java.util.Scanner;

public class Demo08 {
	public static void main(String[] args) {
		Demo08 d=new Demo08();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a=input.nextInt();
		System.out.println("请输入第二个数");
		int b=input.nextInt();
		d.add(a, b);
	}
	void add(int a,int b){
		int result=a+b;
		System.out.println(a+"+"+b+"="+result);
	}
}
