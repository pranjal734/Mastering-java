package com.file.io;
import java.io.*;

public class FileCount {
	public static void main(String[] args) {

		int count =0;
	File f = new File("C:\\windows");
	String[] s = f.list();
	for(String s1 : s) {
		count++;
		System.out.println(s1);
	}
	System.out.println("The total files are: "+count);
	}
	}
	
