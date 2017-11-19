package com.gem.java.�򵥵�һ��һ��ʽ����;


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
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);//��9999�˿ڼ���
		while(true){
			Scanner input = new Scanner(System.in);
			Socket client = server.accept();//��ʼ���տͻ�����������
			String ipStr = client.getInetAddress().getHostAddress();
			if("10.201.1.231".equals(ipStr)){//ֻ��10.201.1.53�Ŀͻ��˻���
				OutputStream os = client.getOutputStream();
				PrintWriter pw =new PrintWriter(os);//���������ͻ��˷�����Ϣ
				
				InputStream is = client.getInputStream();//�����������տͻ��˷��͵���Ϣ
				BufferedReader br = new BufferedReader(new InputStreamReader(is));//����������װ�ɻ�����
				
				pw.println("���ӳɹ���");
				pw.flush();//��ͻ��˷���"���ӳɹ�"����Ϣ

				boolean flag = true ;
				boolean flagOutput = false ;
				boolean flagInput = false ;
				while(flag){
					
					if(!flagInput){
						String msgReceived = br.readLine();
						System.out.println("�ͻ��ˣ�"+msgReceived);//���ղ���ӡ�ͻ��˵���Ϣ

						flagInput = "byebye".equals(msgReceived) ;
						if(flagInput){
							client.shutdownInput();//����ͻ���˵��"byebye",�رշ����������������������޷����տͻ�����Ϣ
						}
					}
					
					if(!flagOutput){
						System.out.print("��˵��");
						String msgSend = input.nextLine();
						pw.println(msgSend);
						pw.flush();//��ͻ��˷�����Ϣ
						
						flagOutput = "byebye".equals(msgSend) ;
						if(flagOutput){
							client.shutdownOutput();
						}
					}//�����ͻ��˷���"byebye"���رշ���������������޷�����ͻ��˷�����Ϣ
					
					
					flag = !( flagOutput && flagInput );//����������Ϳͻ��˶�˵��byebye����flagΪflase,����ѭ��
					
				}
				System.out.println("�ͻ���������....");
			}
		}
	}
}