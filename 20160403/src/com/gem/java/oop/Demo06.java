package com.gem.java.oop;

import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
	Demo06 d=new Demo06();
	Scanner input=new Scanner(System.in);
	System.out.print("请输入位数：");
	int num=input.nextInt();	
	double result=0;
	for(int i = 1 ; i<=num ; i++){
		int fz = d.getFZ(i);
		int fm = d.getFM(i);
		result = result + 1.0*fz/fm;
		System.out.print(fz+"/"+fm+(i==num ? "=" : "+"));
	}
	System.out.println(result);
}
	
	
	//获取分子
	int getFZ(int num){
		if(num==1){
			return 2;
		}else if(num==2){
			return 3; 
		}else{
			return getFZ(num-2)+getFZ(num-1);
		}
	}
	//获取分母
	int getFM(int num){
		if(num==1||num==2){
			return num;
		}else{
			return getFM(num-2)+getFM(num-1);
		}
	}
}
