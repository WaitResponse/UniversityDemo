package com.gem.java.私聊;

import java.io.BufferedReader;
import java.io.IOException;

public class ServerReadMsgThread extends Thread{
	private BufferedReader br;//只有一个br参数，启动时负责接收消息
	public ServerReadMsgThread(BufferedReader br){
	this.br=br;
	}
	
	public void run(){
		while(true){
		String msgRecevied=null;		//读取客户端发送过来的消息，涉及到前面缓冲流的知识
		try {
			msgRecevied=br.readLine();
			System.out.println("客户端说:"+msgRecevied);
			
			if("byebye".equals(msgRecevied)){
				break;
			}			
		} catch (IOException e) { 	 
		
			e.printStackTrace();
		}

	}
	
}
}
