package com.gem.java.object;

public class Demo03 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("abc");
		//sb.delete(2, 3);
		sb.insert(2, "123");//�ڵڶ���Ԫ�أ���b�������123
		System.out.println(sb);
	}
}
