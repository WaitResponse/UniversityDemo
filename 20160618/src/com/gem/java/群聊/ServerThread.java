package com.gem.java.Ⱥ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread {
	private Socket socket;
	private List<Socket>socketList;
	public ServerThread(Socket socket, List<Socket> socketList) {
	this.socket=socket;
	this.socketList=socketList;
	}

	public void run(){
		try {
			InputStream is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			
			while(true){
				String msg=br.readLine();//��ȡ�ͻ��˷��͵���Ϣ 
				for(Socket socket:socketList){
					if(socket!=this.socket){//���˷���������Ϣ�����socket
						new ServerWriteThread(socket,msg).start();//����������Ϣ���̣߳�������������Ϣ���͸������ͻ��ˣ���ת��
					}
				}
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
}
