package com.gem.java.к╫ад;

import java.io.PrintWriter;

public class ServerWriteMsgThread extends Thread {
	private PrintWriter pw;
	private String msgSend;
	public ServerWriteMsgThread(PrintWriter pw,String msgSend){
		this.pw=pw;
		this.msgSend=msgSend;			
	}
	
	public void run(){
		pw.println(msgSend);
		pw.flush();
	}
	
}
