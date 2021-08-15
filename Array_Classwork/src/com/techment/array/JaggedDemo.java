package com.techment.array;

public class JaggedDemo {
    public static void main(String[] args)
    {
		int Arr[][]= {{1,2},{3,4,5,6},{7,8}};
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;i++)
			{
			System.out.println(Arr[i][j]+" ");
		    }
		    System.out.println();
          }	
    }		
}
