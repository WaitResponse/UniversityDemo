package com.gem.java.IOÁ÷;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Demo01 {
	public static void main(String[] args) {
		
		try{			
			Reader reader=new InputStreamReader(new FileInputStream("e:/hello.txt"));		
			Writer writer=new OutputStreamWriter(new FileOutputStream("f:/hello.txt",true));
			
			char[]chars=new char[1024];
			int len=-1;
			while((len=reader.read(chars))!=-1){
				writer.write(new String(chars,0,len));
			}
			writer.flush();
			writer.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
}
