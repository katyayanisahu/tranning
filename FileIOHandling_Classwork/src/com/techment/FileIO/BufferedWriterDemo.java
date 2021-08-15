package com.techment.FileIO;
import java.io.*;
class BufferedWriterDemo 
{
	public static void main(String[] args)throws IOException 
	{
		FileWriter fw=new FileWriter("abc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("FileIOHandling");
		bw.newLine();
		bw.write("Java");
		bw.flush();
		bw.close();
		}
}
