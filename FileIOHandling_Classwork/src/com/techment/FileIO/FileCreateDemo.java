package com.techment.FileIO;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo
{
 public static void main(String[] args)  throws IOException 
 {
	File file=new File("C:\\Users\\ACER\\Documents\\batches\\techment\\exam");
	System.out.println(file.exists());
	//file.createNewFile();
	file.mkdir();
	System.out.println(file.exists());
 }
} 

