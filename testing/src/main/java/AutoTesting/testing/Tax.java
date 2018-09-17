package AutoTesting.testing;

public class Tax {
	
public double calculateTax(int salary) {
		int tax = tax2(salary); 		
		int cal =tax*salary/100;	
		return cal;
		
	}
public int tax2(int salary) {
	
	if(salary >0 && salary <= 14999) {
		return 0; 
	}
	if(salary > 14999 && salary<=19999) {
		return 10; 
		
	}
	if(salary>19999 && salary<=29999) {
		return 15; 
	}
	if(salary>29999 && salary<=449999) {
		return 20;
		
	}
	if (salary>449999) {
		return 25; 
	}		
		return 0;
		
	}

}
