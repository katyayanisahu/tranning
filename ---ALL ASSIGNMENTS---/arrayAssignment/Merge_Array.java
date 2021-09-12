package com.techment.arrayAssignment;
import java.util.Arrays;  
public class Merge_Array 
{  
 public static void main(String[] args)   
 {  
    int a[] = {2,5,8,9};       
    int b[] = {15,3,7,12};  
    int firstArray = a.length;        
    int secondArray = b.length;  
    int c[] = new int[firstArray + secondArray];  
    System.arraycopy(a, 0, c, 0,firstArray );  
    System.arraycopy(b, 0, c,firstArray, secondArray);  
    System.out.println(Arrays.toString(c));  
 }  
}

