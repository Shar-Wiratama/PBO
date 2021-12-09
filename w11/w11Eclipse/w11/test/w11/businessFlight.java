package w11;

public class businessFlight extends Flight { 	 
	 public businessFlight(String id) { 
	 super(id); 
	 } 
	 @Override
	 public boolean addPassenger(Passenger passenger) { 
	 if (passenger.isVip()) { 
	 return Passengers.add(passenger); 
	 } 
	 return false; 
	 } 
	 @Override
	 public boolean removePassenger(Passenger passenger) { 
	 return false; 
	 } 
	}