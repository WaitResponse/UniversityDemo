package com.gem.java.IOÁ÷;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo05 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/person.dat"));
		Person person=(Person)ois.readObject();
		System.out.println(person);
		ois.close();
	}
}
