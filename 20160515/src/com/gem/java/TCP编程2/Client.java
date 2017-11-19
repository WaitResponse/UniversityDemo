package com.gem.java.TCP���2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input= new Scanner(System.in);
		Socket socket = new Socket("10.201.1.231",9999);//�����ͻ���socket,ָ����������IP�Ͷ˿�
		boolean flag = true ;
		
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));//���������������տͻ��˵���Ϣ
		
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);//�������������ͻ��˷�����Ϣ
		
		boolean flagOutput = false ;
		boolean flagInput = false ;
		while(flag){
			if(!flagInput){
				String msgReceived = br.readLine();
				System.out.println(msgReceived);//�Ƚ��շ��������͵�"���ӳɹ�����Ϣ"
				
				flagInput = "byebye".equals(msgReceived) ;
				if(flagInput){
					socket.shutdownInput();//���������˵��byebye,�򣬹رտͻ��˵����������޷��ٽ��շ���������Ϣ
				}
			}
			
			if(!flagOutput){
				System.out.print("��˵��");
				String msgSend = input.nextLine();
				pw.println(msgSend);
				pw.flush();

				flagOutput = "byebye".equals(msgSend) ;
				if(flagOutput){
					socket.shutdownOutput();//�����˵��byebye,�رտͻ��˵���������޷��ٷ�����Ϣ
				}
			}
			
		
			flag = !( flagOutput && flagInput );
		}
	}
}
