package com.gem.java.oop;

public class Demo09 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(i%2==0&&j%2==0){
					break;
				}
				System.out.print(i+"~"+j+"\t");
			}
			System.out.println();
		}
	}
}
