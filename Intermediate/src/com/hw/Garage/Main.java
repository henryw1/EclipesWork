package com.hw.Garage;

import java.util.ArrayList;

public class Main {
	
	
	
	public static void main(String[] args) {
		Garage gar = new Garage(); 
		//Vehicle v1 = new Vehicle(); 
		Car c1 = new Car();
		Bus b1 =new Bus(); 
		Bike k1 = new Bike(); 
		
		b1.setcolor("Blue");
		b1.setSeat(57);
		b1.setwheel(8);
		
		c1.setcolor("Red");
		c1.setSeat(5);
		c1.setwheel(4);
		c1.setmake("Audi");
	
		
		k1.setcolor("Black");
		k1.setSeat(2);
		k1.setwheel(2);
		
	
		 gar.vehicleList.add(b1);
		gar.vehicleList.add(k1);
		gar.vehicleList.add(c1); 
		
		gar.emptyGarage();
		
		//System.out.println(gar.vehicleList.toString());
		
	}
}
