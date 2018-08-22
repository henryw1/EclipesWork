package partTwo;

public class Tester {
	public static void main(String[] args) {
		Vehicle renault = new Vehicle(4, "green", "car");
		Vehicle VW = new Vehicle (4, "green", "car");
		Vehicle bike01 = new Vehicle(4, "red", "bike");
		Vehicle truck =new Vehicle (6, "yellow", "truck");
		
		Garage gar = new Garage(); 		
		gar.add(VW);
		gar.add(bike01);
		gar.add(truck);		
		//gar.calValue(bike01);
		
		gar.remove(truck);
		
		gar.print();
		
		
	}

	
	

}
