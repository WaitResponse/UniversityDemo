package com.gem.java.oop;

public class Demo16 {
		public static void main(String[] args) {
			int i=1;
			while(i<=9){
				int j=1;
				while(j<=i){
					int m=i*j;
					System.out.print(i+"*"+j+"="+m+"\t");
					j++;
				}
				System.out.println();
				i++;
			}
		}
}
