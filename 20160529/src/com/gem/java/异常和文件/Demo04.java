package com.gem.java.�쳣���ļ�;

import java.io.File;
import java.util.Scanner;

public class Demo04 {
	private int initTab = 0;
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		System.out.print("�������ļ���·��:");
		String path=input.next();	
		File file=new File(path);//��ȡ�ļ�·�����ҵ���File
		Demo04 d=new Demo04();
		d.initTab=file.getAbsolutePath().split("\\\\").length;	
		d.printFile(file);			
		}
	
		private void printFile(File file){
			if(file!=null&&file.exists()){      
				String fname =file.getName();   //��ȡFile�����е��ļ����ļ��е�����
				 
				printTab(file);
				
				System.out.println(fname);
				if(file.isDirectory()){			//�ж�File�Ƿ����ļ���
				File []FileArr=file.listFiles();//��File�����е��ļ����ļ���ȡ���ŵ�һ������
				for(int i=0;i<FileArr.length;i++){
					File childFile=FileArr[i];
					printFile(childFile);
				}
				}			
			}
		}
	private void printTab(File file){
		String absPath=file.getAbsolutePath();//��ȡ��File�ľ���·��
		String []arr=absPath.split("\\\\");//split��Ϊ�ָ�
		for (int i = 0; i < arr.length-initTab; i++) {
			System.out.print("\t");//��һ��Ԫ�ؾʹ�ӡһ��\t
		}
	}
	
	
	}

