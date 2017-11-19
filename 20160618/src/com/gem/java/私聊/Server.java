package com.gem.java.私聊;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(4396);//建立服务器，在9999端口监听
		
		while(true){
			Socket client=server.accept();//开始接收客户端的连接请求，接收后client代表客户端
			new ServerReadThread(client).start();//启动服务器接收消息的线程，client作为参数传进去，代表接收和发送客户端的消息
		}				
	}
}
