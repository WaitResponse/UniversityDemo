package com.gem.java.cdw;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<5;i++){	
			System.out.print("请输入第"+(i+1)+"个数字:");
			arr[i]=input.nextInt();		
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
			}
				
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+"\t");
		}
	}
}
