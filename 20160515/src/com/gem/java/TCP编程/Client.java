package com.gem.java.TCP���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("10.201.1.53" , 9999) ;
		//��ȡ�ֽ������
		OutputStream os = client.getOutputStream();//����һ������������ͻ��˵���Ϣ���
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os)));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		//����һ�������������շ�����������
		
		Scanner input = new Scanner(System.in);
		while(true){
			String msg = input.nextLine();
			pw.println(msg);
			pw.flush();
			if("byebye".equals(msg)){
				client.shutdownOutput();	//����ͻ���˵��"byebye"���رտͻ��˵������			
			}
			String serverMsg=br.readLine();
			System.out.println("������˵:"+serverMsg);
			if("byebye".equals(serverMsg)){
				client.shutdownInput();
				break;//���������˵��"byebye"���رտͻ��˵�������	
			}
		}
	}
}