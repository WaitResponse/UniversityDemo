package com.gem.java.object;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Demo08 {
	public static void main(String[] args) throws IOException {
		Reader reader=new FileReader("d:/hello.txt");
		Writer writer=new FileWriter("f:/hello.txt");
		char[]chars=new char[1024];
		int len=-1;
		while((len=reader.read(chars))!=-1){
			String str=new String(chars,0,len);
			System.out.println(str);
			writer.write(new String(chars,0,len));
			writer.flush();
		}
	}
}
