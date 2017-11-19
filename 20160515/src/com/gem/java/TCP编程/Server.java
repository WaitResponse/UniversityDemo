package com.gem.java.TCP���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket ;
		try{
		serverSocket =new ServerSocket(9999);//��9999�˿ڼ���
		System.out.println("�����������ɹ���");
		while(true){
			Socket socket = serverSocket.accept();//��ʼ���ܿͻ�����������
			if(socket!=null){
				String ipStr=socket.getInetAddress().getHostAddress();//��ȡ�ͻ��˵�IP��ַ
				if("10.201.1.231".equals(ipStr)){
				System.out.println("��һ���ͻ���("+ipStr+")����������");
				
				InputStream is=socket.getInputStream();//����һ�������������ܿͻ��˵����
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				
				OutputStream os=socket.getOutputStream();//����һ�����������ȡ�����������
				PrintWriter pw=new PrintWriter(os);
				Scanner input=new Scanner(System.in);
								
				
				while(true){
					String msg=br.readLine();//��ȡ�ͻ��˷��͵���Ϣ
					System.out.println("�ͻ���˵:"+msg);
					
					
					String mymsg=input.nextLine();
					pw.println(mymsg);
					pw.flush();//������˵��ͻ��˷�����Ϣ
					
					
					if("byebye".equals(mymsg)){//���������˵��"byebye",�ر������
					socket.shutdownOutput();
					}
					if("byebye".equals(msg)){
						socket.shutdownInput();//����ͻ���˵��"byebye"���ر�������
						break;
					}
					
				}
			}
		}
		}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}

