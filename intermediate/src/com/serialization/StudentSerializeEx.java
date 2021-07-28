package com.serialization;

import java.io.*;

public class StudentSerializeEx {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {
		Student s1 = new Student("pranjal", 121);
		FileOutputStream fos = new FileOutputStream("f.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fos);
		oo.writeObject(s1);
		oo.close();
		System.out.println("Success");
		
}
}