package com.gem.java.cdw;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("«Î ‰»Î––∫≈£∫");
		int count=input.nextInt();
		
		int i=1;
		while(i<=count){
			int j=1;
			while(j<=(count-i)){
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=(2*i-1)){
				System.out.print(i<=9?(""+i):((char)(55+i)));
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
