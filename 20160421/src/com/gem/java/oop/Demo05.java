package com.gem.java.oop;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("请输入你的身高：");
	double height=input.nextDouble();
	
	System.out.println("请输入你的体重:");
	Double weight=input.nextDouble();
	
	double bmi=weight/(height*height);
	
	System.out.println("您的BMI为："+bmi);
	
	if(bmi<=18.5){
		System.out.println("您的BMI过轻");	
	}else if(bmi>18.5&&bmi<=23.9){
		System.out.println("您的BMI正常");
	}else if(bmi>24&&bmi<=27){
		System.out.println("您的BMI偏重");
	}else if(bmi>32){
		System.out.println("您的BMI肥胖");
	}	
}
}
