package com.gem.java.简单的一问一答式聊天;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input= new Scanner(System.in);
		Socket socket = new Socket("10.201.1.231",9999);//连接服务器的999端口
		boolean flag = true ;
		
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		
		boolean flagOutput = false ;
		boolean flagInput = false ;
		while(flag){
			if(!flagInput){
				String msgReceived = br.readLine();
				System.out.println(msgReceived);
				flagInput = "byebye".equals(msgReceived) ;
				if(flagInput){
					socket.shutdownInput();
				}
			}
			
			if(!flagOutput){
				System.out.print("你说：");
				String msgSend = input.nextLine();
				pw.println(msgSend);
				pw.flush();

				flagOutput = "byebye".equals(msgSend) ;
				if(flagOutput){
					socket.shutdownOutput();
				}
			}
			
			System.out.println(flagOutput + "-" + flagInput );
			flag = !( flagOutput && flagInput );
		}
	}
}
