package com.file.io;
import java.io.*;

public class BufferedReaderEx {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\read1.txt"));
String line = br.readLine();
while(line!=null) {
	System.out.println(line);
	line=br.readLine();
}
br.close();
}
}
