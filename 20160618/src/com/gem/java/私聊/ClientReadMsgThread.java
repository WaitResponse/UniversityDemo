package com.gem.java.私聊;

import java.io.BufferedReader;
import java.io.IOException;

public class ClientReadMsgThread extends Thread {
	private BufferedReader br;
	public ClientReadMsgThread(BufferedReader br){
		this.br=br;		
	}
	public void run(){
		while(true){
			String msgReceived=null;
			try{
			msgReceived=br.readLine();
			System.out.println("服务器说："+msgReceived);
			if("byebye".equals(msgReceived)){//当读到了服务器发送的byebye，跳出循环，线程进入到堵塞状态
				break;
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	}
	
}
