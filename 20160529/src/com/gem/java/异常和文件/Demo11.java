package com.gem.java.�쳣���ļ�;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args)  {
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ���Ƶ��ļ�·��:");
		String srcPath=input.nextLine();
		File srcFile=new File(srcPath);
		System.out.print("������Ҫ���Ƶ����ļ�:");
		String tagetPath=input.nextLine();
		File targetFile=new File(tagetPath);
		
		 new Demo11().copyFile(srcFile,targetFile);
	}
	
	public void copyFile(File srcFile,File targetFile) {
		try{
		Reader reader=new FileReader(srcFile);
		Writer writer=new FileWriter(targetFile);
		
		char[]chars=new char[1024];
		int len=-1;
		while((len=reader.read(chars))!=-1){
			writer.write(new String(chars,0,len));
		}
		writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
