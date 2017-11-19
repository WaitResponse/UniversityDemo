package com.gem.java.异常和文件;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args)throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入：");
		String str=input.nextLine();
		
		OutputStream os=new FileOutputStream("f:/hello.txt",true);//设置为true则不覆盖原来的内容
		byte[]bytes=str.getBytes();
		os.write(bytes);
		os.flush();
		os.close();
	}
}
