package com.gem.java.х╨ад;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReadThread extends Thread{
	private Socket socket;
	public ClientReadThread(Socket socket){
		this.socket=socket;				
	}
	public void run(){		
		try {
		InputStream	is = socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		while(true){
			String msg=br.readLine();
			System.out.println(msg);
		}	
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
