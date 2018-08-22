
import java.util.ArrayList;

public class Goldilocks1 {


		
	public static ArrayList<Spot> listOfSpots = new ArrayList<Spot>();
		
	public void justRight() {
			
		for (int i=0 ; i<listOfSpots.size();i++) {
			
			int weight = listOfSpots.get(i).getChair().getWeightCap();
			int porridge = listOfSpots.get(i).getPorridge().getPorridgeTemp();
			int lighting = listOfSpots.get(i).getLighting().getLight();
			
			if (weight<=100 & porridge<=120 & lighting>=70) {
				System.out.println(i+1);
			}
		}
				

		}
	
	public static void main(String[]args) {
		Goldilocks1 gold1 =  new Goldilocks1();
		Porridge p1 = new Porridge();
		p1.setPorridgeTemp(90);
		
		Chair c1 = new Chair();
		c1.setWeightCap(297);
		
		Lighting l1 = new Lighting();
		l1.setLight(54);
		
		Spot s1= new Spot();
		
		s1.setChair(c1);
		s1.setPorridge(p1);
		s1.setLighting(l1);
		
		listOfSpots.add(s1);
		gold1.justRight();
		

	}
	
	
}
