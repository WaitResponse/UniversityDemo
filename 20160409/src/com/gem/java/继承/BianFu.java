package com.gem.java.�̳�;
//����
public class BianFu extends Animal{
	
	String name ;

	//����ȷʵ����˯��������������ǲ�̫ͬ�⸸���˯��,��Ҫ��д˯������
	public void sleep() {
		System.out.println("����˯....");
		//��ֻ����ø����е�hello����
		super.hello();
	}
	
	//��д
	public void hello(){
//		System.out.println(super.name);
		System.out.println("BianFu hello....");
	}
}
/*
��д��
1)������֮��ͬ�������Ĺ�ϵ
2)������������һģһ��
3)���಻����С����ķ������η�
4)���಻���׳��ȸ��������쳣
*/

//��java�У��̳�ֻ�������̳�
//ͨ��super���ø���ķ���.ͨ��super���Ե��ø�������Ժͷ���
//super�������this��ǰ����