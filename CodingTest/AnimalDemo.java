package com.techment.CodingTest;
	abstract class Animal{
		
		abstract void shout();
		
	}

	class Dog extends Animal{

		@Override
		void shout() {
			System.out.println("bark");
		}
		
		
	}

	class Horse extends Animal{

		@Override
		void shout() {
			System.out.println("neigh");
		}
		
		
	}


	class Cat extends Animal{
		
		@Override
		void shout() {
			System.out.println("me-ow");
		}
	}


	public class AnimalDemo {

		public static void main(String[] args) {

	 
			Animal animal = new Cat();
			animal.shout();
		}

}

