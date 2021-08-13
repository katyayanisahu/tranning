package com.techment.OOPSAssignment;

class Address {
          private String addressLine;
	      private String city;
	      String getaddressLine()
		  {
			  return addressLine;
		  }
		  public void setaddressLine(String addressLine )
		  {
			  this.addressLine=addressLine;
		  }
		  public String getcity()
		  {
			  return city;
		  }
		  public void setcity(String city)
		  {
			  this.city=city;
		  }
	   
	   
		  Address(String addressLine,String city)
	     {
		     setaddressLine(addressLine);
		     setcity(city);
         }
	     public String getAddressDetails()
	     {	
	    	 String fulladdress;
	    	 fulladdress=getaddressLine()+',' +getcity();
	    	 return(fulladdress);
	    	 
	     }
}
class Customer
{
	private String customerName;
	private Address residentialAddress;
	  public String getcustomerName()
	  {
		  return customerName;
	  }
	  public void setcustomerName(String customerName )
	  {
		  this.customerName=customerName;
	  }
	  public Address getresidentialAddress()
	  {
		  return residentialAddress;
	  }
	  public void setresidentialAddress(Address residentialAddress )
	  {
		  this.residentialAddress=residentialAddress;
	  }
	  
 
    Customer()
    {
	     setcustomerName(null);
	     setresidentialAddress(null);
    }
    Customer(String customerName,Address residentialAddress)
    {
	     setcustomerName(customerName);
	     setresidentialAddress(residentialAddress);
    }
    public String getCustomerDetails()
    {
    	String CustomerDetails;
    	CustomerDetails="Customer : "+getcustomerName()+"\n"+"Residential Address : "+residentialAddress.getAddressDetails() ;
   	    return(CustomerDetails);
   	 }
}
class TestCustomer
{
	public static void main(String[] args) {
		String myAddress;
		Address addr = new Address("Ayodhya Nagar" , "Raipur");		
		Customer cust=new Customer();
		cust.setcustomerName("kajal");
		cust.setresidentialAddress(addr);
		myAddress = addr.getAddressDetails();
		System.out.println(cust.getcustomerName() + '\n' + myAddress);
	}
}
	  
	    	
	     
	   
	   
	   
	 

