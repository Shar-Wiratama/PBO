package w11;

public class economyFlight extends Flight { 
	 public economyFlight(String id) { 
	 super(id); 
	 }
	 @Override
	 public boolean addPassenger(Passenger passenger) { 
	 return Passengers.add(passenger); 
	 } 
	 @Override
	 public boolean removePassenger(Passenger passenger) { 
	 if (!passenger.isVip()) { 
	 return Passengers.remove(passenger); 
	 } 
	 return false; 
	 } 
	}