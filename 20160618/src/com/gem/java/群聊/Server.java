package com.gem.java.群聊;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	public static void main(String[] args) throws IOException {
		try{
		List<Socket>socketList=new ArrayList<Socket>();//建立一个socket集合，代表有多个客户端
		ServerSocket server=new ServerSocket(9999);
		
		while(true){
		Socket socket=server.accept();
		socketList.add(socket);//一旦接收到了客户端的连接请求，就将该客户端放入socket集合
		new ServerThread(socket,socketList).start();//启动服务器线程，在服务器线程里面再启动接收和发送消息的线程
		}
		}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		 