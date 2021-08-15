package com.techment.FileIO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Sachin");
		System.out.println("Serialization Started");
		try
		{
			FileOutputStream fos = new FileOutputStream("hello.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			fos.close();
			System.out.println("Serialization Stopped");
		}catch(IOException e)
		{
			System.err.println(e.getClass());
			System.err.println(e.getMessage());
			System.err.println("Serialization not done.");
		}
		
		
	}

}
