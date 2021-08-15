package com.techment.FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("abc.text");
	fw.write("hello");
	fw.write(92);
	fw.write(80);
	System.out.println("written successfully");
	fw.close();
	
 }
}
