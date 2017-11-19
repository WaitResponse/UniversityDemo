package com.gem.java.GUI;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;


public class Demo01 {
	public static void main(String[] args) {
		
		Frame frame=new Frame("FlowLayout");
		
		Panel panel1=new Panel();
		panel1.setBackground(Color.black);
		
		Panel panel2=new Panel();
		panel2.setBackground(Color.blue);
		Button btn1=new Button("ËÀÍö");
		Button btn2=new Button("»ÙÃð");
		panel2.add(btn1);
		panel2.add(btn2);
		
		
		Panel panel3=new Panel();
		panel3.setBackground(Color.pink);
		
		frame.add(panel1,BorderLayout.WEST);
		frame.add(panel2,BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.SOUTH);
		
		
		frame.setBounds(200, 200, 500, 500);
		frame.setVisible(true);
	}
}
