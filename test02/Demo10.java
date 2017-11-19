package com.gem.java.object;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo10 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream("d:/hello.txt")));
		String str=null;
		while((str=bf.readLine())!=null){
			System.out.println(str);
		}
		
		
	}
}
