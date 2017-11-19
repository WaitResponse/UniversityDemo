package com.gem.java.object;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Demo09 {
	public static void main(String[] args) throws IOException {
		Writer writer =new FileWriter("d:/hello.txt");
		Scanner input=new Scanner(System.in);
		System.out.print("«Î ‰»Î£∫");
		String str=input.next();
		writer.write(str);
		writer.flush();
	}
}
