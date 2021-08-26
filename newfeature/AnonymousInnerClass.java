package com.techment.day12.newfeature;
class Parent
{
	void phone()
	{
		System.out.println("mi");
	}

}
public class AnonymousInnerClass
{
	public static void main(String[] args) 
	{
		Parent parent2=new Parent()
		{
			void phone()
			{
				System.out.println("samsung");
			}
		};
        parent2.phone();		
      }
}
