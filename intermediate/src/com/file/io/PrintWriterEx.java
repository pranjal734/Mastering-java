package com.file.io;
import java.io.*;

public class PrintWriterEx {
public static void main(String[] args) throws IOException{
	PrintWriter pw = new PrintWriter("C:\\Users\\abc1.txt");
pw.write(100);
pw.println(100);
pw.write("Durga");
pw.println(true);
pw.close();
}
}
