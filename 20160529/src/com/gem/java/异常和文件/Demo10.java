package com.gem.java.�쳣���ļ�;

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
		System.out.print("������Ҫ���Ƶ��ļ���·��:");
		String srcPath=input.nextLine();
		File srcFile=new File(srcPath);	
		System.out.print("������Ҫ���Ƶ����ļ���·��:");
		String targetPath=input.next();
		Demo10 d=new Demo10();
		 d.copyFile(srcFile,targetPath);			
		}
		private void copyFile(File srcFile,String targetPath){
			if(srcFile.exists()){//���Ҫ���Ƶ�File����
				String fname=srcFile.getName();//��ȡҪ���Ƶ�File������
				File targetFile=new File(targetPath+"/"+fname);//ʵ����һ��Ŀ��File
				if(srcFile.isDirectory()){//���Ҫ���Ƶ�File���ļ���
					targetFile.mkdirs();//��Ŀ��·������һ���ļ���
					File []childArr=srcFile.listFiles();//��Ҫ���Ƶ��ļ��������е�File���뵽һ����Ŀ¼����
					for (int i = 0; i < childArr.length; i++) {
						String childTargetPath=targetFile.getAbsolutePath();//��ȡĿ��File�ľ���·��
						File childFile=childArr[i];//�����ļ�ȡ��
						copyFile(childFile,childTargetPath);//�����ļ��ݹ����copyFile������ֱ���ҳ����е����ļ��к�Ŀ¼
					}
				}else{//���Ҫ���Ƶ�File�ļ��в����ڣ���File���ļ�
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
					
				
				
				
				
				
				
				
			
		
		

		
		
		
	

