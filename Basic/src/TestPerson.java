import java.util.List;
import java.util.ArrayList;

public class TestPerson extends Person{

	public TestPerson(String name, int age, String job) {
		super(name, age, job);
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args) {
		Person person1 = new Person("John", 22, "Software Developer");
		Person Person2 = new Person("James", 75, "Software Tester");
		
		person1.toString(); 
		System.out.println(); 
		person1.getAge();
		ArrayList<Person> people = new ArrayList<Person>();
		// List<String> people = new ArrayList<>();		
		 //System.out.println(person1.name());	 
		 people.add(person1);
		 people.add(Person2);
		 
//		 for (String j: people) {
//			 System.out.println(j);
//		 	 
		 System.out.println(people.toString());
	
		 
	}
	

}
