package com.gem.java.˽��;

import java.io.BufferedReader;
import java.io.IOException;

public class ServerReadMsgThread extends Thread{
	private BufferedReader br;//ֻ��һ��br����������ʱ���������Ϣ
	public ServerReadMsgThread(BufferedReader br){
	this.br=br;
	}
	
	public void run(){
		while(true){
		String msgRecevied=null;		//��ȡ�ͻ��˷��͹�������Ϣ���漰��ǰ�滺������֪ʶ
		try {
			msgRecevied=br.readLine();
			System.out.println("�ͻ���˵:"+msgRecevied);
			
			if("byebye".equals(msgRecevied)){
				break;
			}			
		} catch (IOException e) { 	 
		
			e.printStackTrace();
		}

	}
	
}
}
