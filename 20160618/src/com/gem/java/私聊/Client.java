package com.gem.java.私聊;

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
		PrintWriter pw = new PrintWriter(os);//建立输入输出流
		
		new ClientReadMsgThread(br).start();//启动读取消息的线程
		while(true){
			String msg=input.nextLine();
			new ClientWriteMsgThread(pw,msg).start();//启动发送消息的线程
			if("byebye".equals(msg)){//当读到了服务器发送的byebye，跳出循环，线程死亡
				break;
			}
		}
	}
}
