package com.gem.java.oop;

public class Demo01 {
	public static void main(String[] args) {
		Demo01 d = new Demo01();
		for(int i = 1 ; i<=10 ; i++){
			int count = d.getTZ(i);
			System.out.println("��"+i+"�죺"+count+"����");
		}
	}
	
	//������ҵڼ��죬�Ҹ����㵱����������
	int getTZ(int day){
		if(day==10){
			return 1 ;
		}else{
			return (getTZ(day+1)+1)*2 ;
		}
	}
}

/*

���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�� 
�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�


*/