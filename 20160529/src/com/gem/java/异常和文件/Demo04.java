package com.gem.java.异常和文件;

import java.io.File;
import java.util.Scanner;

public class Demo04 {
	private int initTab = 0;
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		System.out.print("请输入文件夹路径:");
		String path=input.next();	
		File file=new File(path);//获取文件路径后找到该File
		Demo04 d=new Demo04();
		d.initTab=file.getAbsolutePath().split("\\\\").length;	
		d.printFile(file);			
		}
	
		private void printFile(File file){
			if(file!=null&&file.exists()){      
				String fname =file.getName();   //获取File里所有的文件和文件夹的名称
				 
				printTab(file);
				
				System.out.println(fname);
				if(file.isDirectory()){			//判断File是否是文件夹
				File []FileArr=file.listFiles();//将File里所有的文件和文件夹取出放到一个数组
				for(int i=0;i<FileArr.length;i++){
					File childFile=FileArr[i];
					printFile(childFile);
				}
				}			
			}
		}
	private void printTab(File file){
		String absPath=file.getAbsolutePath();//获取该File的绝对路径
		String []arr=absPath.split("\\\\");//split意为分割
		for (int i = 0; i < arr.length-initTab; i++) {
			System.out.print("\t");//有一个元素就打印一个\t
		}
	}
	
	
	}

