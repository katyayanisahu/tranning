package com.techment.OOPSAssignment;

import java.util.Scanner;

abstract class PrepaidCard 
{
  int CardNo;
  double availableBalance;
  double swipeLimit;
   abstract void swipeCard();
}
class TravelCard extends PrepaidCard
{
	int rewardPoints;

	@Override
	public void swipeCard() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:");
		int Amount1=sc.nextInt();
		
	}
	public void rechargeCard() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:");
		int Amount2=sc.nextInt();
		int sum=(int) (Amount2+availableBalance);
		
	}

	@Override
	public String toString() {
		return "TravelCard [rewardPoints=" + rewardPoints + "]";
	}
	
}