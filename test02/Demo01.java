package com.gem.java.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		Reader reader =new InputStreamReader(new FileInputStream("e:/hello.txt") );
		Writer writer =new OutputStreamWriter(new FileOutputStream("d:/hello.txt"));
	
		char[]chars=new char[1024];
		int len=-1;
		while((len=reader.read(chars))!=-1){
			System.out.println(new String(chars,0,len));
			writer.write(new String(chars,0,len));
		}
			writer.flush();	
			writer.close();
	
	}
}
