package com.file.io;
import java.io.File;
import java.io.IOException;

public class FileEx {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users","abc.txt");
	f.createNewFile();
	f.exists();
	
}
}
