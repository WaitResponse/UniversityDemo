package com.gem.java.私聊;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerReadThread extends Thread {//在这个线程里面，负责建立输入和输出流并启动接收和发送消息的线程 ，将输入输出的信息作为参数传递给其他两个线程
	
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
				os=socket.getOutputStream();//os向客户端发送的消息
				pw=new PrintWriter(os);
				
				is=socket.getInputStream();//is读取客户端发送的消息
				br=new BufferedReader(new InputStreamReader(is));
			    //创建输入输出流	
		
				new ServerWriteMsgThread(pw,"连接成功!").start();//该线程没有放入循环，所以只启动一次，只发送"连接成功"这条消息
				//启动发送消息的线程，向客户端发送"连接成功"
				new ServerReadMsgThread(br).start();//调用带参数的构造方法并启动线程
				//启动接收消息的线程
				
				while(true){
					String msg=input.nextLine();
					new ServerWriteMsgThread(pw,msg).start();//因为发送消息的线程有些特殊，当发送了byebye就要跳出循环，所以在发送消息的线程外外又嵌套一个循环
					if("byebye".equals(msg)){
						break;
					}
				}//如果你说了byebye，结束循环，并结束发送消息的线程，无法发送消息
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
}
