package com.techment.OOPS;
class Employee {
   private String name;
   private int id;
   
   public int getId() {
	   return id;
   }
   public void setId(int id) {
	   this.id=id;
   }
   public String getName() {
	   return name;
   }
   public void setName(String name) {
	   this.name=name;
   }
}  
public class EncapsulationDemo
{
	public static void main(String[] args)
    {
		Employee emp=new Employee();
		emp.setId(1);
		System.out.println(emp.getId());
		
		
		emp.setName("katya");
		System.out.println(emp.getName());
    }
}
  


