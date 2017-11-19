package com.gem.java.异常和文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo08 {
	public static void main(String[] args)throws  IOException {
		InputStream is=new FileInputStream("e:/hello.txt");
		byte []bytes=new byte[5];
		int len=-1;
		while((len=is.read(bytes))!=-1){
			String str=new String(bytes, 0,len);
			System.out.print(str);
			
		}
		
		
		
	}
}
