package com.gem.java.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo06 {
	public static void main(String[] args) throws IOException {
		InputStream is=new FileInputStream("d:/hello.txt");
		OutputStream os=new FileOutputStream("f:hello.txt");
		 byte[]bytes=new byte[1024];
		 int len=-1;
		 while((len=is.read(bytes))!=-1){
			 String str=new String(bytes,0,len);
			 System.out.print(str);
			 os.write(bytes,0,len);
		 }
	}
}
