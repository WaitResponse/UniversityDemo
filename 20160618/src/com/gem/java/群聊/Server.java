package com.gem.java.Ⱥ��;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	public static void main(String[] args) throws IOException {
		try{
		List<Socket>socketList=new ArrayList<Socket>();//����һ��socket���ϣ������ж���ͻ���
		ServerSocket server=new ServerSocket(9999);
		
		while(true){
		Socket socket=server.accept();
		socketList.add(socket);//һ�����յ��˿ͻ��˵��������󣬾ͽ��ÿͻ��˷���socket����
		new ServerThread(socket,socketList).start();//�����������̣߳��ڷ������߳��������������պͷ�����Ϣ���߳�
		}
		}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		 