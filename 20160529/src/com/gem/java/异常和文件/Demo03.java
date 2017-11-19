package com.gem.java.异常和文件;
import java.io.File;


public class Demo03 {
		public static void main(String[] args) {
			//在java语言中，File既可以表示文件又可以表示文件夹
			File file=new File("c:/File语法/hello/hell/hel/he");
			
//			file.isFile();//判断是否是文件夹
//			file.isHidden();//判断文件夹是否是隐藏的
//			file.createNewFile();//创建文件
			//file.mkdirs();//创建指定的目录，如果父目录不存在，怎先创建父目录
			file.mkdirs();//创建一个叫hello.txt的文件夹,前提条件是父目录存在
			
		}
}
