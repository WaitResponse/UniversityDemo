package com.gem.java.IO��;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		/*1.��һ�ַ���
	 InputStream is = new FileInputStream("f:/hello.txt");	
	 BufferedReader dw=new BufferedReader(new InputStreamReader(is));*/
		//2.�����ַ���
		BufferedReader dw=new BufferedReader(new FileReader("f:/hello.txt"));
		//3.�ڶ��ַ���  BufferedReader dw=new BufferedReader(new InputStreamReader(new FileInputStream("f:hello.txt")));
		String str=null;
		/*while((str=dw.readLine())!=null){
			System.out.println(str);
		}//���ж�
*/		char[] chars = new char[1024];
		int len = -1 ;
		
		while((len = dw.read(chars))!=-1){
			System.out.print(new String(chars , 0 , len)); //һ���ַ�һ���ַ���
	}
}
}
