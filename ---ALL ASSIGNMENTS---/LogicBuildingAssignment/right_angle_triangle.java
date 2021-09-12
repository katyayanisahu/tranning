package com.techment.assign1;
import java.util.Scanner;
public class right_angle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>0 && b>0 && c>0){
            int a1 = a*a;
            int b1 = b*b;
            int c1 = c*c;
            if(c1== a1+b1 || b1==a1+c1 || a1==b1+c1){
                System.out.println("Right-Angle Triangle");
            }
            else {
                System.out.println("Not a right-angle Triangle");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
