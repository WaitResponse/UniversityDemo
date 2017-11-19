package com.gem.java.Server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class MsgSendThread extends Thread {
	private String myMsg;
	private Socket socket;
	
	public MsgSendThread(String myMsg,Socket socket){
		this.myMsg=myMsg;
		this.socket=socket;
	
	}
	
	public void run (){
		OutputStream os;
		try {
			os = socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			pw.println(myMsg);
			pw.flush();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
