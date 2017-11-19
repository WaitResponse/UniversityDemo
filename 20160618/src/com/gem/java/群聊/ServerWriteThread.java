package com.gem.java.群聊;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWriteThread extends Thread {
	private Socket socket;
	private String msg;
	public ServerWriteThread(Socket socket,String msg){
		this.socket=socket;
		this.msg=msg;
	}
	public void run(){
		 
		try {
			OutputStream os = socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			pw.println("你已连接到你爸爸的电脑");
			pw.println(msg);
			pw.flush();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
