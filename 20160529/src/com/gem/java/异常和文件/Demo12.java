package com.gem.java.�쳣���ļ�;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args)throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.print("�����룺");
		String str=input.nextLine();
		
		OutputStream os=new FileOutputStream("f:/hello.txt",true);//����Ϊtrue�򲻸���ԭ��������
		byte[]bytes=str.getBytes();
		os.write(bytes);
		os.flush();
		os.close();
	}
}
