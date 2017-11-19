package com.gem.java.TCP编程2;

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
		Socket socket = new Socket("10.201.1.231",9999);//创建客户端socket,指定服务器的IP和端口
		boolean flag = true ;
		
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));//创建输入流，接收客户端的消息
		
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);//创建输出流，向客户端发送消息
		
		boolean flagOutput = false ;
		boolean flagInput = false ;
		while(flag){
			if(!flagInput){
				String msgReceived = br.readLine();
				System.out.println(msgReceived);//先接收服务器发送的"连接成功的消息"
				
				flagInput = "byebye".equals(msgReceived) ;
				if(flagInput){
					socket.shutdownInput();//如果服务器说了byebye,则，关闭客户端的输入流，无法再接收服务器的消息
				}
			}
			
			if(!flagOutput){
				System.out.print("你说：");
				String msgSend = input.nextLine();
				pw.println(msgSend);
				pw.flush();

				flagOutput = "byebye".equals(msgSend) ;
				if(flagOutput){
					socket.shutdownOutput();//如果你说了byebye,关闭客户端的输出流，无法再发送消息
				}
			}
			
		
			flag = !( flagOutput && flagInput );
		}
	}
}
