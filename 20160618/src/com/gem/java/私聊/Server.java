package com.gem.java.˽��;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(4396);//��������������9999�˿ڼ���
		
		while(true){
			Socket client=server.accept();//��ʼ���տͻ��˵��������󣬽��պ�client����ͻ���
			new ServerReadThread(client).start();//����������������Ϣ���̣߳�client��Ϊ��������ȥ��������պͷ��Ϳͻ��˵���Ϣ
		}				
	}
}
