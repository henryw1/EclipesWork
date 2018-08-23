package com.hw.Garage;

import java.util.ArrayList;

public class Garage {
	
	private Vehicle vehicle; 
	public static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public int calculateBill() {
		int price = 0; 
		for(int i = 0; i <vehicleList.size(); i++) {
		
			if(vehicleList.get(i) instanceof Car) {
				price  = 20 ; 
				
			}else if (vehicleList.get(i) instanceof Bike) {
				price = 5; 
			}else if (vehicleList.get(i) instanceof Bus) {
				price = 7;
			}     
			
		}
		return price;		
	}
	
	public void add(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void remove(Vehicle vehicle) {
		
		vehicleList.remove(vehicle);
		
	}
	
	public void emptyGarage() {
		vehicleList.removeAll(vehicleList);			
	}
	

	

}
