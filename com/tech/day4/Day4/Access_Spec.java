package com.techment.Day4;
class Superclass
{
     public int i=5;
     private int l;
     protected int j=6;
     void Show_Method()
     {
        System.out.println("Sup j= "+j);
     }
}
class Subclass extends Superclass
{
    int k;
    void Display()
    {
         System.out.println("Sub k= "+k);
         System.out.println("Sub i= "+i);
         System.out.println("Sub j= "+j);
         //System.out.println("Sub l= "+l);
    }
}
class Access_Spec
{ 
     public static void main(String args[])
     {
        Superclass obj1=new Superclass();
        Subclass obj2=new Subclass();
        obj1.Show_Method();
        obj2.Display();
     }
}  
  


