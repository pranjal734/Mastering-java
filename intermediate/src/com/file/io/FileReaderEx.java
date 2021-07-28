package com.file.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException{
File f = new File("c:\\Users","read1.txt");
FileReader fr = new FileReader(f);
char[] ch = new char[(int)f.length()];
fr.read(ch);
for(char ch1:ch) {
	System.out.print(ch1);
}
}
}