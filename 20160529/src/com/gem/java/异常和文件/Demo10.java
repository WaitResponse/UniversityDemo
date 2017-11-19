package com.gem.java.异常和文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要复制的文件夹路径:");
		String srcPath=input.nextLine();
		File srcFile=new File(srcPath);	
		System.out.print("请输入要复制到的文件夹路径:");
		String targetPath=input.next();
		Demo10 d=new Demo10();
		 d.copyFile(srcFile,targetPath);			
		}
		private void copyFile(File srcFile,String targetPath){
			if(srcFile.exists()){//如果要复制的File存在
				String fname=srcFile.getName();//获取要复制的File的名称
				File targetFile=new File(targetPath+"/"+fname);//实例化一个目标File
				if(srcFile.isDirectory()){//如果要复制的File是文件夹
					targetFile.mkdirs();//在目标路径创建一个文件夹
					File []childArr=srcFile.listFiles();//将要复制的文件夹中所有的File放入到一个子目录数组
					for (int i = 0; i < childArr.length; i++) {
						String childTargetPath=targetFile.getAbsolutePath();//获取目标File的绝对路径
						File childFile=childArr[i];//将子文件取出
						copyFile(childFile,childTargetPath);//将子文件递归调用copyFile方法，直到找出所有的子文件夹河目录
					}
				}else{//如果要复制的File文件夹不存在，即File是文件
					try{
						InputStream is=new FileInputStream(srcFile);
						OutputStream os=new FileOutputStream(targetFile);
						byte []bytes=new byte[1024];
						int len=-1;
						while((len=is.read(bytes))!=-1){
							os.write(bytes,0,len);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
					
				}
		}
		}
}
					
				
				
				
				
				
				
				
			
		
		

		
		
		
	

