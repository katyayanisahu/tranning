package com.techment.arrayAssignment;
import java.util.Scanner;
public class SortingArray {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 10;
    int a[] = new int[n];
    
    System.out.println("Enter 10 elements that you want to enter in an array:");
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    
    //Bubble Sort
    for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
            if (a[i] > a[j]) {
                int t = a[j];
                a[j] = a[j];
                a[j] = t;
            }
        } 
    }
    
    System.out.println("Sorted Array:");
    for (int i = 0; i < n-1; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println(a[n-1]);
  }
}
