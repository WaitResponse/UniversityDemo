package com.gem.java.object;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/hello.txt",true)));
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.print("«Î ‰»Î£∫");
		String str=input.nextLine();
		if("byebye".equals(str)){
			bw.flush();
		
			break;
		}
		
		bw.write(str+"\r\n");
		}
	
	
	}
}
