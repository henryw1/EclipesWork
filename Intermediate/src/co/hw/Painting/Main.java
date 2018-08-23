package co.hw.Painting;

import java.util.ArrayList;

import com.hw.Garage.Vehicle;

public class Main {
	
	public static void main(String[] args) {		
		
		Paint p1 = new Paint(); 
		CheapoMax ch = new CheapoMax(); 
		DuluxPaint du = new DuluxPaint(); 
		AverageJoes av = new AverageJoes();
			
		ch.setLitre(20);
		ch.setPrice(19.99);
		ch.setSize(10);		
		
		du.setLitre(15);
		du.setPrice(17.99);
		du.setSize(11);
				
		av.setLitre(10);
		av.setPrice(25);
		av.setSize(20);
				
		Paint.paintList.add(ch);
		Paint.paintList.add(du);
		Paint.paintList.add(av);	
		System.out.println(p1.price());
		
		
	}
	
	

}
