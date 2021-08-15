package com.techment.FileIO;
import java.io.File;
import java.io.IOException;

public class FileCreateDemo2 {
	 public static void main(String[] args)  throws IOException 
	 {
		File file=new File("paper");
		System.out.println(file.exists());
		//file.createNewFile();
		file.mkdir();
		System.out.println(file.exists());
	 }
} 
