package com.gem.java.群聊;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread {
	private Socket socket;
	private List<Socket>socketList;
	public ServerThread(Socket socket, List<Socket> socketList) {
	this.socket=socket;
	this.socketList=socketList;
	}

	public void run(){
		try {
			InputStream is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			
			while(true){
				String msg=br.readLine();//读取客户端发送的消息 
				for(Socket socket:socketList){
					if(socket!=this.socket){//除了发送这条消息以外的socket
						new ServerWriteThread(socket,msg).start();//启动发送消息的线程，并将读到的消息发送给其他客户端，即转发
					}
				}
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
}
