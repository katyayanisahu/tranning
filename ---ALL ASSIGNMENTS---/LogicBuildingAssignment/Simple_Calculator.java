package com.techment.assign1;
import java.util.Scanner;
class Simple_Calculator
{
  public static void main(String[] args)
  {
  
    char operator;
    int number1, number2, result;

    Scanner sc = new Scanner(System.in);
    System.out.println("Select any operator: +, -, *, or /");
    operator = sc.next().charAt(0);

   
    System.out.println("Enter first number");
    number1 = sc.nextInt();

    System.out.println("Enter second number");
    number2 = sc.nextInt();

    switch (operator) 
	{
      case '+':   
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

     
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }	
}

