package com.gem.java.�쳣���ļ�;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Demo09 {
	public static void main(String[] args)  {
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ���Ƶ��ļ�·��:");
		String srcPath=input.nextLine();
		File srcFile=new File(srcPath);
		System.out.print("������Ҫ���Ƶ����ļ�:");
		String tagetPath=input.nextLine();
		File targetFile=new File(tagetPath);
		 Demo09 d=new Demo09();
		 d.copyFile(srcFile,targetFile);
	}
			
	public void copyFile(File srcFile,File targetFile){
		try{
			InputStream is=new FileInputStream(srcFile);
			OutputStream os=new FileOutputStream(targetFile);
			byte[]bytes=new byte[1024];
			int len=-1;
			while((len=is.read(bytes))!=-1){
				os.write(bytes,0,len);
			}
			System.out.println("���Ƴɹ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
		}
	
	}

