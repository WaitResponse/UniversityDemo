package com.gem.java.�쳣���ļ�;
import java.io.File;


public class Demo03 {
		public static void main(String[] args) {
			//��java�����У�File�ȿ��Ա�ʾ�ļ��ֿ��Ա�ʾ�ļ���
			File file=new File("c:/File�﷨/hello/hell/hel/he");
			
//			file.isFile();//�ж��Ƿ����ļ���
//			file.isHidden();//�ж��ļ����Ƿ������ص�
//			file.createNewFile();//�����ļ�
			//file.mkdirs();//����ָ����Ŀ¼�������Ŀ¼�����ڣ����ȴ�����Ŀ¼
			file.mkdirs();//����һ����hello.txt���ļ���,ǰ�������Ǹ�Ŀ¼����
			
		}
}
