package com.gem.java.˽��;

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
			System.out.println("������˵��"+msgReceived);
			if("byebye".equals(msgReceived)){//�������˷��������͵�byebye������ѭ�����߳̽��뵽����״̬
				break;
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	}
	
}
