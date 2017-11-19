package com.gem.java.Object;

public class Demo01{
	public static void main(String[] args) {
		Demo01 d = new Demo01();
		String str = d.toString() ;
		System.out.println(str);
	}
}
//һ�������û����ʽ��дextends����Ĭ�ϼ̳�Object --  һ�ж����Object
/*
equals
toString()

Returns a string representation of the object. 
In general, the toString method returns a string that "textually represents" this object. 
The result should be a concise but informative representation that is easy for a person to read. 
It is recommended that all subclasses override this method. 
The toString method for class Object returns a string consisting of the name of the class of 
which the object is an instance, 
the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object.
 In other words, this method returns a string equal to the value of: 

 getClass().getName() + '@' + Integer.toHexString(hashCode())



*/