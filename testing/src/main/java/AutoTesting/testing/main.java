package AutoTesting.testing;

/**
 * Hello world!
 *
 */
public class main 
{
    public static void main( String[] args )
    {
    	BlackJack bl = new BlackJack(); 
    	Tax  tax = new Tax(); 
    	
    	
    	System.out.println(tax.calculateTax(19999));
    	
    	System.out.println(bl.blackJack(5, 4));
    }
    
	
}
