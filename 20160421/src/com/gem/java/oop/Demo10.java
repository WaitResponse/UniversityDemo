package com.gem.java.oop;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("«Î ‰»Î––∫≈£∫");
		int count=input.nextInt();
		
		for(int i=1;i<=count;i++){
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
