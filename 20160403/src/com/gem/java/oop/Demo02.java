package com.gem.java.oop;

public class Demo02 {
	public static void main(String[] args) {
		int[]arr={1,1,2,5,5,0,3,1,9,7,7,8,3};
		int[]arr2=new int[arr.length];
		int size=0;
				
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			boolean flag=false;//Ä¬ÈÏ²»ÖØ¸´
			for(int j=0;j<size;j++){
			if(num==arr2[j]){
				flag=true;
				break;
			 }
			}
			if(!flag){
				arr2[size++]=num;
			}
		}
			for(int k=0;k<size;k++){
				System.out.print(arr2[k]+"\t");
			}	
	}
}
