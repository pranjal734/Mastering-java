package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserializeEx {
public static void main(String[] args) throws FileNotFoundException, IOException {
	ObjectInputStream oi = new ObjectInputStream(new FileInputStream("f.txt"));
	try {
		Student s = (Student) oi.readObject();

		System.out.println(s.id + " " + s.name);
	} catch (ClassNotFoundException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}
