package com.techment.Day5;

interface JdbcConnection {
	 void connect();
}
class Oracle implements JdbcConnection
{ 
			@Override
			public void connect() {
				System.out.println("method of Oracle class");
				
			}
}	    
class SQL implements JdbcConnection
{

	@Override
	public void connect() {
		System.out.println("method of SQL class");
		
	} 
}		
class DemoInterf
{
public static void main(String[] args)
{
        Oracle obj1=new Oracle();
        obj1.connect();
		SQL obj2=new SQL();
		obj2.connect();
}
}

