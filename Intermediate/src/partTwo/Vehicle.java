package partTwo;

public class Vehicle {
	
	private int numberOfWheels; 
	private String color;
	private String type;
	private int ID; 
	private static int increment=1; 
	
	public Vehicle(int wheels, String color ) {
		this.numberOfWheels = numberOfWheels; 
		this.color = color;
		this.type = type; 
		this.ID = increment++; 
					
	}	
	
	public Vehicle() {
		
	}

	public Vehicle(int wheels, String color, String type) {
		// TODO Auto-generated constructor stub
		this.numberOfWheels = numberOfWheels; 
		this.color = color;
		this.type = type; 
		this.ID = increment++;
	}

	public int getNumberOfWheels() {
		return numberOfWheels; 
	}
	
	public String getColor() {
		 return color; 
	}
	public  String getType() {
		return type; 
	}
	public String toString() {
		
		String veh = this.ID + ", "+ this.color +", "+ this.type;  
		return veh;  
	}

}
