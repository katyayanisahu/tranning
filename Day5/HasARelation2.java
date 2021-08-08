package com.techment.Day5;
class Customer
{
	int custid;
	String custName;
	Account account;
	public Customer(int custid, String custName, Account account) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.account = account;
	}
	public void displayCustomerInfo()
	{
		System.out.println("custid:"+custid);
		System.out.println("custName:"+custName);
		
		System.out.println("accountNo:"+ account.accountNo);
		System.out.println("accountType:"+ account.accountType);
		System.out.println("balance:"+ account.balance);
		System.out.println("ifse:"+ account.ifse);
		System.out.println("branch:"+ account.branch);
	
    }
}	
class Account{
	int accountNo;
	String accountType;
	int balance;
	int ifse;
	String branch;
	public Account(int accountNo, String accountType, int balance, int ifse, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifse = ifse;
		this.branch = branch;
	}
}
public class HasARelation2 {
	public static void main(String[] args)
	{
		Account acc=new Account(917263846,"Saving",5000,8109283,"SBI");
	    Customer cust=new Customer(101,"Katyayani",acc);
	    
	    cust.displayCustomerInfo();
    }
}	
