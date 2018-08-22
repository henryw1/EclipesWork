
public class Person {

	private String name; 
	private int age;
	private String job;
	
	public  Person(String name, int age, String job) {
		this.age =age; 
		this.name = name;  
		this.job =job;
		//return job;		
	}
	
	public String getName() {
		return name;
	}	
	public int getAge() {
		return age; 
	}
	public String getJob() {
		return job;
	}
	public String toString() {
		
		String person = name + ", "+ age +", "+ job;  
		return person;  
	}
	public String subStr (String person) {
		String kept = person.substring( 0, person.indexOf(","));
		return kept;
	}
}
