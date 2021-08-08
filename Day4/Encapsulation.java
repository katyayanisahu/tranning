package com.techment.Day4;
class Employee2 {
	private int empid;
    public void setEmpid(int eid)
    {
        empid=eid;
    }
    public int getEmpid()
    {
       return empid;
    }
}
class Encapsulation
{
     public static void main(String args[])
     {
         Employee2 emp=new Employee2();
         emp.setEmpid(100);
         System.out.println(emp.getEmpid());
     }
}

	
