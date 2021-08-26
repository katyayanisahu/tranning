package com.techment.modal;

public class Tea implements IHotDrink {
  int price;
  
  public void setPrice(int price) {
	this.price = price;
}

void message()
  {
	  System.out.println("you are drinking tea..");
	  System.out.println("have a great day..");
  }

@Override
public void drink() {
	// TODO Auto-generated method stub
	
}
}
