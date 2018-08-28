package co.hw.RCP;

public class Rcp {
	private int countWin = 0; 
	private int countWinComp = 0;
	
	public void compare(String in) {	
		
		String computerChoice = "";	
		double randy = Math.floor(Math.random()*3);
	
		if (randy == 0.0 && !in.equals("Q")) {
			computerChoice="rock"; 
		}else if (randy == 1.0 && !in.equals("Q")) {
			computerChoice = "scissors";
		}else if (randy == 2.0 && !in.equals("Q")) {
			computerChoice = "paper"; 
		}
		System.out.println(computerChoice);		
		if (in.equals(computerChoice)) {
			System.out.println("its a tie");
		}else if (in.equals("rock") && computerChoice.equals("scissors")) {
			System.out.println("you win");
			countWin = countWin + 1; 
		}else if (in.equals("rock")&& computerChoice.equals("paper")) {
			System.out.println("you lose");
			countWinComp =countWinComp+1;
		}else if (in.equals("scissors") && computerChoice.equals("rock")) {
			System.out.println("you lose");
			countWinComp =countWinComp+1;
		}else if (in.equals("scissors")&& computerChoice.equals("paper")) {
			System.out.println("you win");
			countWin = countWin+1;
		}else if (in.equals("paper")&& computerChoice.equals("rock")) {
			System.out.println("you win");
			countWin = countWin+1;
		}else if (in.equals("paper")&& computerChoice.equals("scissors")) {
			System.out.println("you lose");
			countWinComp =countWinComp+1; 
		}

	}
	
	public void Calculate(int count ) {		

		double compPercentage = (countWinComp * 100/count); 
		System.out.println( "Computer won " +countWinComp+ " times " + "per: " + compPercentage + "%" );
		
		double humanPercentage = (countWin*100/count); 
		System.out.println( "You won " +countWin+ " times " + "per: " + humanPercentage + "%" );
		
		double tieCount = count - (countWin + countWinComp);
		
		double tiePercentage = tieCount/count * 100; 
		System.out.println( "you tied " +tieCount+ " times " + "per: " + tiePercentage + "%" );
	
	}

}
