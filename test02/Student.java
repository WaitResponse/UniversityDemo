package com.gem.java.object;

class Student {
	String name;
	String address;
	int number;
	void Introduce (){
		System.out.println("��Һã��ҽ�"+name+"������"+address+"�����Ҷ�����");
	}
	public static void main(String[] args){
		Student student=new Student();
		student.name="�¶���";
		student.address="�����Ƽ�ʦ����ѧ";
		student.number=20156312;
		student.Introduce();	
	}
}
