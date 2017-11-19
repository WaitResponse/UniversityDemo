package com.gem.java.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) throws IOException {
		OutputStream os=new FileOutputStream("d:/hello.txt");
		Scanner input=new Scanner(System.in);
		System.out.print("«Î ‰»Î£∫");
		String str=input.next();
		os.write(str.getBytes());
	}
}
