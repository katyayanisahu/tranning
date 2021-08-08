package com.techment.Day5;
class Car {
			String model;
			String name;
			Engine engine;//object reference
			public Car(String model, String name, Engine engine)
			{
			   super();
			   this.model = model;
			   this.name = name;
			   this.engine = engine;
			}
			public void displayCarInfo()
			{
				System.out.println("model:"+model);
				System.out.println("name:"+name);
				System.out.println("engineId:"+engine.engineId);
				System.out.println("engineType:"+engine.engineType);
			}
}	
class Engine
{
		int engineId;
		String engineType;
		public Engine(int engineId, String engineType) 
		{
			super();
			this.engineId = engineId;
			this.engineType = engineType;
        }
}
public class HasAReln {
		public static void main(String[] args)
		{ 
			Engine obj1=new Engine(129,"2Stock");
			Car obj2=new Car("Honda","Sedan",obj1);
			obj2.displayCarInfo();

		}
}
			
