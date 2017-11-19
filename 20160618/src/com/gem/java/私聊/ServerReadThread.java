package com.gem.java.˽��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerReadThread extends Thread {//������߳����棬�������������������������պͷ�����Ϣ���߳� ���������������Ϣ��Ϊ�������ݸ����������߳�
	
		private Socket socket;
		Scanner input=new Scanner(System.in);
		
		public ServerReadThread(Socket socket){
			this.socket=socket;
		}
		
		public void run(){
			OutputStream os=null;
			PrintWriter pw=null;
			InputStream is=null;
			BufferedReader br=null;
			
			try {
				os=socket.getOutputStream();//os��ͻ��˷��͵���Ϣ
				pw=new PrintWriter(os);
				
				is=socket.getInputStream();//is��ȡ�ͻ��˷��͵���Ϣ
				br=new BufferedReader(new InputStreamReader(is));
			    //�������������	
		
				new ServerWriteMsgThread(pw,"���ӳɹ�!").start();//���߳�û�з���ѭ��������ֻ����һ�Σ�ֻ����"���ӳɹ�"������Ϣ
				//����������Ϣ���̣߳���ͻ��˷���"���ӳɹ�"
				new ServerReadMsgThread(br).start();//���ô������Ĺ��췽���������߳�
				//����������Ϣ���߳�
				
				while(true){
					String msg=input.nextLine();
					new ServerWriteMsgThread(pw,msg).start();//��Ϊ������Ϣ���߳���Щ���⣬��������byebye��Ҫ����ѭ���������ڷ�����Ϣ���߳�������Ƕ��һ��ѭ��
					if("byebye".equals(msg)){
						break;
					}
				}//�����˵��byebye������ѭ����������������Ϣ���̣߳��޷�������Ϣ
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
}
