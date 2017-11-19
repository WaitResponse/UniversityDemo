package com.gem.java.IO¡˜;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	Writer bw=new FileWriter("E:/hello.txt",true);
	while(true){
		System.out.print("«Î ‰»Î:");
		String msg=input.nextLine();
		if("byebye".equals(msg)){
			bw.flush();
			bw.close();
			break;
		}
		bw.write(msg+"\r\n");
	}
	
	
	}
}
