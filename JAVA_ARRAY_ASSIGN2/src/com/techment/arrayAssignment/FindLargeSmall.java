package com.techment.arrayAssignment;

import java.util.Arrays;

public class FindLargeSmall {
     public static void main(String[] args)
     {
    	 int Arr[]= {8,50,12,10,25,17,5,8,1,3};
    	 System.out.println("Array= "+Arrays.toString(Arr));
    	 Arrays.sort(Arr);
    	 System.out.println("Sorted Array is:"+Arrays.toString(Arr));
    	 System.out.println("First largest no:= "+Arr[9]);
    	 System.out.println("Second largest no:= "+Arr[8]);
    	 System.out.println("First smallest no:= "+Arr[0]);
    	 System.out.println("Second smallest no:= "+Arr[1]);
     }
}
