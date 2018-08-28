import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
	ArrayList<Position> axisList = new ArrayList<Position>();
	
	for (int i = 1; i <=7; i++) {		
		for (int j = 1; j <=6 ; j++) {			
			Position p = new Position(i,j);
			axisList.add(p);			
		}
		
	}
	
	System.out.println(axisList.toString());
	
	//Position p1 = new Position(1, 1);
	}

}
