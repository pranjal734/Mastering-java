package com.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String name;
int id;
public Student(String name,int id) {
	// TODO Auto-generated constructor stub
this.name = name;
this.id = id;
}
}
