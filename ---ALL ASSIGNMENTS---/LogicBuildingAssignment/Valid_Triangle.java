package com.techment.assign1;

import java.util.Scanner;

public class Valid_Triangle {
    
    public static void main(String[] args) {
         
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of first side of triangle:");
        double a = sn.nextDouble();
         
        System.out.println("Enter length of second side of triangle:");
        double b = sn.nextDouble();
         
        System.out.println("Enter length of third side of triangle:");
        double c = sn.nextDouble();
         
        Valid_Triangle vt   = new Valid_Triangle();
        if(vt.isTriangleValid(a, b, c)) {
            System.out.println("Sides entered can form a triangle!");
        }else {
            System.out.println("Sides entered cannot form a triangle!");
        }
         
    }
    private boolean isTriangleValid(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
        }
    }
}
