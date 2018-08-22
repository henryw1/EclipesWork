
public class Parameters {

//	public Parameters(String Name, int Age, String job) {
//		super(Name, Age, job);
//		
//	}

	public static void main(String[] args) {
		String hello = "Hello world";
		Parameters helloworld = new Parameters(); 				
		//System.out.println(helloworld.returnString(hello));
		System.out.println(helloworld.returnInt(20, 30, false));
		//System.out.println(helloworld.twentyOne(20, 20));
		//System.out.println(helloworld.uniqueSum(30, 20, 30));
		int ar [] = new int [25]; 
		
		int day = 3; 
		switch (day) { 
		case 1: 
			System.out.print("test");		
			break;
			
		case 2:
			System.out.print("case2");
			break;
		case 3:
			System.out.println("case 3");		
		}
		
		
		Person person1 = new Person ("jon", 32, "developer"); 
	}
	
	public String returnString(String param) {
		
		return param ; 
		
	}
	
	public int returnInt(int one, int two, boolean t) {
		int sum=0;
		if (t) {
			sum = one + two;
			}else {
				sum = one * two;
			}
		 		
		return sum; 
	}
	
	public int twentyOne(int first, int second) {
		int num =0; 
		if (first >= second & first<=21) {
			num = first; 
		}else if(second >= first & second<=21) {
			num=first; 
		}else {
			num = 0; 
		}
		return num; 
	}
	
	public int uniqueSum(int one, int two, int three) {
		int sum; 
		if (one == two) {
			sum = three;
		}else if (two == three) {
			sum = one;
			
		}else if (one == three) {
			sum = two; 
		} else {
			sum = one + two + three; 
		}
		
		return sum; 
	}
	
	public boolean tooHot(int temparature, boolean isSummer) {
		boolean bool=true; 
		if (temparature <= 90 | temparature >= 60 & isSummer ) {
			bool = true;
		}else if (temparature >= 90 | temparature <=100 & !isSummer ) {
			bool=false; 
		}
		return bool; 
	}
	
}
