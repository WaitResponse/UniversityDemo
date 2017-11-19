package com.gem.java.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(4396);
		List<Socket>socketList=new ArrayList<Socket>();
		List<Person>personList=new ArrayList<Person>();
	
		while(true){
			Socket socket=server.accept();
			socketList.add(socket);
			new ServerThread(personList,socket,socketList).start();
		}
		
	}
}
