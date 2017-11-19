package com.gem.java.TCP编程;

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
		serverSocket =new ServerSocket(9999);//在9999端口监听
		System.out.println("服务器启动成功！");
		while(true){
			Socket socket = serverSocket.accept();//开始接受客户端连接请求
			if(socket!=null){
				String ipStr=socket.getInetAddress().getHostAddress();//获取客户端的IP地址
				if("10.201.1.231".equals(ipStr)){
				System.out.println("有一个客户端("+ipStr+")连接上来了");
				
				InputStream is=socket.getInputStream();//建立一个输入流，接受客户端的输出
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				
				OutputStream os=socket.getOutputStream();//建立一个输出流，获取服务器的输出
				PrintWriter pw=new PrintWriter(os);
				Scanner input=new Scanner(System.in);
								
				
				while(true){
					String msg=br.readLine();//获取客户端发送的信息
					System.out.println("客户端说:"+msg);
					
					
					String mymsg=input.nextLine();
					pw.println(mymsg);
					pw.flush();//服务器说向客户端发送信息
					
					
					if("byebye".equals(mymsg)){//如果服务器说了"byebye",关闭输出流
					socket.shutdownOutput();
					}
					if("byebye".equals(msg)){
						socket.shutdownInput();//如果客户端说了"byebye"，关闭输入流
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

