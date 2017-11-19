package com.gem.java.к╫ад;

import java.io.PrintWriter;

public class ClientWriteMsgThread extends Thread {
	private PrintWriter pw=null;
	private String msg=null;
	public ClientWriteMsgThread(PrintWriter pw,String msg){
		this.pw=pw;
		this.msg=msg;
	}
	public void run(){
		pw.println(msg);
		pw.flush();
	}
}
