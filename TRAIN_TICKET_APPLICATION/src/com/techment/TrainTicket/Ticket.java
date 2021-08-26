package com.techment.TrainTicket;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
class Ticket 
{
	
	private int counter =1 ;
	private String pnr;
	private Date travelDate;
	private Train train;
	private Passenger passenger1;
	private double totalPrice = 0;
	private double fare = 0;
	public Ticket(Date travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr)
	{
		this.pnr = pnr;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public Passenger getPassenger() {
		return passenger1;
	}
	public void setPassenger(Passenger passenger1) {
		this.passenger1 = passenger1;
	}
	
	public String generatePNR()
	{
		
		pnr = train.getSource().charAt(0) + train.getDestination().charAt(0)+"_"+travelDate;
		return pnr;
	}

	public double calcPassengerFare(Passenger passenger)
	{
		
		char gender = passenger.getGender();
		if(passenger.getAge() <= 12)
		{
			fare = fare - (fare * 0.5);
		}else if(passenger.getAge() >= 60)
		{
			fare = fare - (fare * 0.4);
		}else if(gender =='f' || gender == 'F')
		{
			fare = fare - (fare * 0.25); 
		}
		return fare;
	}
	
	TreeMap<Passenger, Integer> passengerTicket = new TreeMap<Passenger, Integer>();
	public void addPassenger(String name, int age, char gender)
	{
		passengerTicket.put((new Passenger(name, age, gender)), counter++);
	}
	
	public double calculateTotalTicketPrice()
	{
		totalPrice = fare * counter;
		return totalPrice;
	}
	
	public void generateTicket()
	{
		StringBuilder sb = new StringBuilder("Ticket booked with PNR: ");
		sb.append(pnr);
		System.out.println(sb);
	}
	
	public void writeTicket() throws IOException 
	{
		try 
		{
			PrintWriter pw = new PrintWriter(new FileWriter(pnr +".txt"));
			pw.println("PNR: "+pnr);
			pw.println("Train no.: "+train.getTrainNo());
			pw.println("Train Name: "+train.getTrainName());
			pw.println("From"+train.getSource());
			pw.println("To: "+train.getDestination());
			pw.println("Travel Date: "+travelDate);
			pw.println("");
			pw.println("Passengers: ");
			pw.println("NAME\tAGE\tGender\tFARE");
			for(Map.Entry<Passenger, Integer> entry : passengerTicket.entrySet())
			{
				pw.println(entry.getKey().getName()+"\t"+entry.getKey().getAge()+"\t"+entry.getKey().getGender()+"\t"+fare);
			}
			pw.println("Total Price: "+totalPrice);
			//pw.close;	
		}
		catch(Exception e)
		{
			System.out.println("ticket cannot be written");
		}
	}
}

