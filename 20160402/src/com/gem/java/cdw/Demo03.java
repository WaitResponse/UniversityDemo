package com.gem.java.cdw;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int []scoreArr=new int[5];
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println("请输入第"+(i+1)+"个同学的成绩:");
			scoreArr[i]=input.nextInt();
		}
		System.out.println("录入完成，正在分析...");
		int max=scoreArr[0];
		int min=scoreArr[0];
		int sum=0;
		int avg=0;
		for(int i=0;i<scoreArr.length;i++){
			if(scoreArr[i]<min){
				min=scoreArr[i];
			}
			if(scoreArr[i]>max){
				max=scoreArr[i];
			}
			sum=sum+scoreArr[i];			
		}
		avg=sum/scoreArr.length;
		System.out.println("最高分是："+max);
		System.out.println("最低分是："+min);
		System.out.println("平均分："+avg);
	}
}
