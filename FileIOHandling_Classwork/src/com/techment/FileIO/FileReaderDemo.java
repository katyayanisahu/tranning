package com.techment.FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("abc.text");
	int  ch=fr.read();
	while(ch!=-1)
	{
		System.out.println((char)ch);
		ch=fr.read();
	}
  }
}
