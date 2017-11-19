package com.gem.java.GUI;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo02 {
	public static void main(String[] args) {
		final Frame frame=new Frame("事件监听器");		
		frame.setBounds(200, 200, 500, 500);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			//System.exit(0);//0表示正常退出
			frame.setVisible(false);//表示隐藏窗口，如果在内部类内部想访问外部类的变量，那么外部类的这个变量一定使用final修饰 
			
		}
			
		});
		
		
		 /* frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				//System.exit(0);//0表示正常退出
				frame.setVisible(false);//表示隐藏窗口，如果在内部类内部想访问外部类的变量，那么外部类的这个变量一定使用final修饰 
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		
	}
	
}
