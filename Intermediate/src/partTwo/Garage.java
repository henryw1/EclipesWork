package partTwo;

import java.util.ArrayList;
import java.util.List;

public class Garage {
		
//	public static void main(String [] args) {
				
	ArrayList<Vehicle> vehicle = new ArrayList<>();					
	
	
	public void calValue(Vehicle vehicle) {
		double price = 0;			
		
		if (vehicle.getType()=="car") {
		price = 200.99; 	
		}else if(vehicle.getType()== "truck"){
			price = 700.65;
		}else if(vehicle.getType()=="bike") {
		
			price = 20.656; 
		}	
		System.out.println(price); 	
		
	}
	
	public void add(Vehicle veh) 
	{
		vehicle.add(veh);
	}
	
	public void remove(Vehicle veh ) 
	{
		vehicle.remove(veh);
		System.out.println(veh + " Has been removed from Garage");
		
	}
	public void fix(Vehicle veh) {
			
		
	}
	public void print()
	{
		for (Vehicle vehicle2 : vehicle) {
			System.out.println(vehicle2);
		}
		 
	}
	
}
