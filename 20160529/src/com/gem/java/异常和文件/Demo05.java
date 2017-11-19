package com.gem.java.异常和文件;

import java.io.File;
import java.util.Scanner;

public class Demo05 {
	private int initTab=0;
	public static void main(String[] args) {
		Demo05 d=new Demo05();
		System.out.print("请输入文件夹路径:");
		Scanner input =new Scanner(System.in);
		String path=input.next();
		File file=new File(path);
		d.initTab=file.getAbsolutePath().split("\\\\").length;
		d.printFile(file);
		
	}
	
	public void printFile(File file){
		if(file!=null&&file.exists()){
			String fname=file.getName();
			printTab(file);
			System.out.println(fname);	
			
			if(file.isDirectory()){
				File[]fileArr=file.listFiles();
				for(int i=0;i<fileArr.length;i++){
					File childFile=fileArr[i];
					printFile(childFile);
				}
				
			}
		}
	}
	
	public void printTab(File file){
		String abs=file.getAbsolutePath();
		String []arr=abs.split("\\\\");
		for (int i = 0; i < arr.length-initTab; i++) {
			System.out.print("\t");
		}
		
	} 
}
