package AutoTesting.testing;

public class BlackJack {	
	
	public int blackJack(int a, int b) {
		
		if (a>21 && b> 21) {
			
			return 0; 
		} 
		if (a<=0 || b<= 0) {
			return 0; 
		}
		if ( a>21 ) { 
				return b; 
			//c=a;
			}
			else if(b>21) {
			return a;
			}
			else { 
			return Math.max(a, b);
			}

		}

}
