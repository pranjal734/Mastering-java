package com.file.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("C:\\Users\\abc1.txt");
	fw.write(100);
	fw.write("urgaSoft\nSolutions");
	fw.flush();
	fw.close();
}
}
