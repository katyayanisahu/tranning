package com.techment.modal;
public class Bank {
	   String bankName;
	   String ifseCode;
	   String branch;
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setIfseCode(String ifseCode) {
		this.ifseCode = ifseCode;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	   
	 public void displayBankDetails()
	  {
		  System.out.println("Name:"+bankName);
		  System.out.println("IFSE Code:"+ifseCode);
		  System.out.println("Branch:"+branch);
		  
	  }
}

