package com.gem.java.TCP编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("10.201.1.53" , 9999) ;
		//获取字节输出流
		OutputStream os = client.getOutputStream();//建立一个输出流，将客户端的信息输出
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os)));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		//建立一个输入流，接收服务器的输入
		
		Scanner input = new Scanner(System.in);
		while(true){
			String msg = input.nextLine();
			pw.println(msg);
			pw.flush();
			if("byebye".equals(msg)){
				client.shutdownOutput();	//如果客户端说了"byebye"，关闭客户端的输出流			
			}
			String serverMsg=br.readLine();
			System.out.println("服务器说:"+serverMsg);
			if("byebye".equals(serverMsg)){
				client.shutdownInput();
				break;//如果服务器说了"byebye"，关闭客户端的输入流	
			}
		}
	}
}