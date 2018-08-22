import java.util.ArrayList;

public class Goldilocks {
	
	public static ArrayList<Object> listOfPlaces = new ArrayList<Object>();
	
	public void justRight() {
		
		for (int i=0 ; i<listOfPlaces.size();i++) {
			
			int weight = ((Places) listOfPlaces.get(i)).getWeightCap();
			int temp = ((Places) listOfPlaces.get(i)).getPorridgeTemp();
			if (weight<=100 & temp<=80) {
				System.out.println(i+1);
			}
		
		}
	}
	
	
//	public static void main(String[]args) {
//		
//		Goldilocks Gold = new Goldilocks();
//		
//		Places p1 = new Places();
//		p1.setWeightCap(30);
//		p1.setPorridgeTemp(50);
//		
//		Places p2 = new Places();
//		p2.setWeightCap(130);
//		p2.setPorridgeTemp(60);
//		
//		Places p3 = new Places();
//		p3.setWeightCap(90);
//		p3.setPorridgeTemp(60);
//		
//		Places p4 = new Places();
//		p4.setWeightCap(150);
//		p4.setPorridgeTemp(85);
//		
//		Places p5 = new Places();
//		p5.setWeightCap(120);
//		p5.setPorridgeTemp(70);
//		
//		Places p6 = new Places();
//		p6.setWeightCap(200);
//		p6.setPorridgeTemp(200);
//		
//		Places p7 = new Places();
//		p7.setWeightCap(110);
//		p7.setPorridgeTemp(100);
//		
//		
//		listOfPlaces.add(p1);
//		listOfPlaces.add(p2);
//		listOfPlaces.add(p3);
//		listOfPlaces.add(p4);
//		listOfPlaces.add(p5);
//		listOfPlaces.add(p6);
//		listOfPlaces.add(p7);
//		
//		Gold.justRight();
//		
//	}

}
