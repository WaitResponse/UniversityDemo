package com.gem.java.object;

public class Demo03 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("abc");
		//sb.delete(2, 3);
		sb.insert(2, "123");//在第二个元素，即b后面插入123
		System.out.println(sb);
	}
}
