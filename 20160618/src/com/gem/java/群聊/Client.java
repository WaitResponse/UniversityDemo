package com.gem.java.х╨ад;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		
		try {
			Socket socket=new Socket("10.201.1.231",9999);
			
			new ClientWriteThread(socket).start();
			new ClientReadThread(socket).start();
			
			
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
