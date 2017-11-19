package com.gem.java.oop;

public class Demo03 {
	public static void main(String[] args) {
		int[]arr={1,1,2,5,5,0,3,1,9,7,7,8,3};
		int[]arr2=new int[arr.length];
		int size=0;
		
		int[]heiarr=new int[arr.length];
		int hsize=0;
		
		
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			
			boolean flag=true;//默认是合法的
			for(int j=0;j<hsize;j++){
				if(heiarr[j]==num){
					flag=false;	
					break;
				}
			}
			if(flag){
				for(int k=i+1;k<arr.length;k++){
				if(arr[k]==num){
					heiarr[hsize++]=num;
					flag=false;
					break;
				}				
			}
			}
			if(flag){
				arr2[size++]=num;		
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(arr2[i]+"\t");
		}
	}
}
