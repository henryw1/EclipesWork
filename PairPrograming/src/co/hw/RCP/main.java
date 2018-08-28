package co.hw.RCP;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Rcp game1 = new Rcp(); 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("press enter to begin game");
		String start = scan.nextLine();
		
		System.out.println("Type rock paper or scisors to beat computer.  to quit game press Q");		
		String in = ""; 
			
	
		int count = 0; 		
		while(!in.equals("Q")) {					
				
			in = scan.nextLine();
			game1.compare(in);
			count = count+1;			
					
		}		
		
		System.out.println("Total Games Played: " + (count-1));
		
		game1.Calculate(count-1);
		
	
		
	}

}
