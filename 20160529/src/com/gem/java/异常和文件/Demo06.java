package com.gem.java.异常和文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo06 {
	public static void main(String[] args) throws IOException {
		String fileName ="E:/资料"+File.separator+"hello.txt";
		File f=new File(fileName);
		 InputStream in=new FileInputStream(f);
		 byte[]b=new byte[1024];
		 in.read(b);
		 in.close();
		 System.out.println(new String(b));
	}
}
