package com.gem.java.GUI;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo02 {
	public static void main(String[] args) {
		final Frame frame=new Frame("�¼�������");		
		frame.setBounds(200, 200, 500, 500);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			//System.exit(0);//0��ʾ�����˳�
			frame.setVisible(false);//��ʾ���ش��ڣ�������ڲ����ڲ�������ⲿ��ı�������ô�ⲿ����������һ��ʹ��final���� 
			
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
				//System.exit(0);//0��ʾ�����˳�
				frame.setVisible(false);//��ʾ���ش��ڣ�������ڲ����ڲ�������ⲿ��ı�������ô�ⲿ����������һ��ʹ��final���� 
				
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
