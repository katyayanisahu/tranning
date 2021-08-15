package com.techment.Collection;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {


		LinkedList o1 =new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		
		o1.addFirst(1000);
		
		o1.addLast(6543);
		
		System.out.println(" elemets= "+o1);
		
		
		o1.removeLast();
		
		System.out.println("after Removal = "+o1);
		
		

	}

}
