package com.gem.java.异常和文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo07 {
	public static void main(String[] args) {
		try{
			InputStream is=new FileInputStream("e:/hello.txt");
			while(true){
				int data=is.read();
				if(data==-1){
					break;
				}
				System.out.print((char)data);
			}
		}catch (FileNotFoundException e ) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
