package com.gem.java.简单的一问一答式聊天;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);//在9999端口监听
		while(true){
			Scanner input = new Scanner(System.in);
			Socket client = server.accept();//开始接收客户端连接请求
			String ipStr = client.getInetAddress().getHostAddress();
			if("10.201.1.231".equals(ipStr)){//只和10.201.1.53的客户端互动
				OutputStream os = client.getOutputStream();
				PrintWriter pw =new PrintWriter(os);//输出流，向客户端发送消息
				
				InputStream is = client.getInputStream();//输入流，接收客户端发送的消息
				BufferedReader br = new BufferedReader(new InputStreamReader(is));//将输入流包装成缓冲流
				
				pw.println("连接成功！");
				pw.flush();//向客户端发送"连接成功"的消息

				boolean flag = true ;
				boolean flagOutput = false ;
				boolean flagInput = false ;
				while(flag){
					
					if(!flagInput){
						String msgReceived = br.readLine();
						System.out.println("客户端："+msgReceived);//接收并打印客户端的消息

						flagInput = "byebye".equals(msgReceived) ;
						if(flagInput){
							client.shutdownInput();//如果客户端说了"byebye",关闭服务器的输入流，服务器无法接收客户端消息
						}
					}
					
					if(!flagOutput){
						System.out.print("你说：");
						String msgSend = input.nextLine();
						pw.println(msgSend);
						pw.flush();//向客户端发送消息
						
						flagOutput = "byebye".equals(msgSend) ;
						if(flagOutput){
							client.shutdownOutput();
						}
					}//如果向客户端发送"byebye"，关闭服务器的输出流，无法再向客户端发送消息
					
					
					flag = !( flagOutput && flagInput );//如果服务器和客户端都说了byebye，则flag为flase,结束循环
					
				}
				System.out.println("客户端已下线....");
			}
		}
	}
}