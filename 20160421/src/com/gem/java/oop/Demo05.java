package com.gem.java.oop;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("�����������ߣ�");
	double height=input.nextDouble();
	
	System.out.println("�������������:");
	Double weight=input.nextDouble();
	
	double bmi=weight/(height*height);
	
	System.out.println("����BMIΪ��"+bmi);
	
	if(bmi<=18.5){
		System.out.println("����BMI����");	
	}else if(bmi>18.5&&bmi<=23.9){
		System.out.println("����BMI����");
	}else if(bmi>24&&bmi<=27){
		System.out.println("����BMIƫ��");
	}else if(bmi>32){
		System.out.println("����BMI����");
	}	
}
}
