package com.tech.day6.exception;

import java.io.FileNotFoundException;
public class CheckedAndUnchecked2 {
	 public static void main(String[] args) throws FileNotFoundException
	 {
	      throw new FileNotFoundException("file is not present");
	  		 
	 }
}