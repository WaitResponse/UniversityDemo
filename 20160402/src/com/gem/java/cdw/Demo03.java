package com.gem.java.cdw;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int []scoreArr=new int[5];
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println("�������"+(i+1)+"��ͬѧ�ĳɼ�:");
			scoreArr[i]=input.nextInt();
		}
		System.out.println("¼����ɣ����ڷ���...");
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
		System.out.println("��߷��ǣ�"+max);
		System.out.println("��ͷ��ǣ�"+min);
		System.out.println("ƽ���֣�"+avg);
	}
}
