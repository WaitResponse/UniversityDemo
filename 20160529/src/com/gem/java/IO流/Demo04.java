package com.gem.java.IO¡˜;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo04 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Person p1=new Person("’≈“ÊÃ“","sb",32);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/person.dat"));
		
		oos.writeObject(p1);
		oos.flush();
		oos.close();
		
		
	}
}
