package com.gem.java.oop;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		
		
		int arr[]={10,8,33,21,65};
		
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}				
				}	
			}
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
		}
		
	}
}
