package com.file.io;
import java.io.*;

public class FileReaderExCopy {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("C:\\Users\\read1.txt");
	int i = fr.read();
	while(i!=-1) {
		System.out.print((char)i);
		i =fr.read();
	}
}
}
