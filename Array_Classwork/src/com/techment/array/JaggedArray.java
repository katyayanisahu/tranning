package com.techment.array;

public class JaggedArray {
   public static void main(String[] args) {
	    int arr[][]=new int[4][];
	    arr[0]=new int[2];
	    arr[1]=new int[4];
	    arr[2]=new int[6];
	    arr[3]=new int[8];
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[i].length;j++)
	    	{
	    		System.out.println(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
     }
}
