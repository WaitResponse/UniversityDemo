package com.gem.java.chat;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MsgSendThread extends Thread{
	private Socket socket ;
	private String myMsg ;
	private String nickName;
	public MsgSendThread(String myMsg , Socket socket,String nickName){
		this.myMsg = myMsg ; 
		this.socket = socket ;
		this.nickName=nickName;
	}
	
	public void run(){
		OutputStream os;
		try {
			String myMsgSend=nickName+"------->"+myMsg;
			os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			StringBuilder msgTemp = new StringBuilder("operate:chat");
			msgTemp.append("___")
			.append("content:").append(myMsgSend);
			String msg = msgTemp.toString();
			pw.println(msg);
			
			
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}