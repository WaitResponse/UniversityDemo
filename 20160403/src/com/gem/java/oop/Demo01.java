package com.gem.java.oop;

public class Demo01 {
	public static void main(String[] args) {
		int[]arr={5,0,4,3,12,0,23,0,1,0};
		int[]newarr=new int[arr.length];
		int size=0;//新数组默认长度
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				newarr[size++]=arr[i];
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(newarr[i]+"\t");
		}		
	}
}
