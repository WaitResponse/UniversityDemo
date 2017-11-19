package com.gem.java.测试;

public abstract class Test01 {
	public static void main(String[] args) {
		
		
		for(int i=0;i<10;i++){
			System.out.println(i+"t");
		}
		
	
		for(;i<11;i++){//这里i=9
			System.out.println(i);
		}
		//c语言这样写是没错的
	}
}
