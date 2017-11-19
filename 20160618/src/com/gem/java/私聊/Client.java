package com.gem.java.˽��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[]args) throws IOException {
		Scanner input=new Scanner(System.in);
		Socket socket=new Socket("10.201.1.",9999);
		
		InputStream is=socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);//�������������
		
		new ClientReadMsgThread(br).start();//������ȡ��Ϣ���߳�
		while(true){
			String msg=input.nextLine();
			new ClientWriteMsgThread(pw,msg).start();//����������Ϣ���߳�
			if("byebye".equals(msg)){//�������˷��������͵�byebye������ѭ�����߳�����
				break;
			}
		}
	}
}
