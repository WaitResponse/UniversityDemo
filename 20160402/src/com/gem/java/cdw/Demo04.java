package com.gem.java.cdw;

public class Demo04 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		do{
			sum=sum+i;
			System.out.print(i+(i==10?"=":"+"));
			i++;
		}
		while(i<=10);
		System.out.println(sum);
	}
}
