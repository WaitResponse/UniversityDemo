package com.gem.java.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextPane;

public class MsgReceiveThread extends Thread {
	private Socket socket;
	private JTextPane pnlChatContent;
	public MsgReceiveThread(Socket socket,JTextPane pnlChatContent){
		this.socket=socket;
		this.pnlChatContent=pnlChatContent;
	}
	public void run(){		
		try {
			InputStream is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			while(true){
				String msg=br.readLine();
				pnlChatContent.setText(pnlChatContent.getText()+msg);//服务器转发的消息在pnlChatContent里面显示出来
			}
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
		
	}
}
