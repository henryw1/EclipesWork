package co.hw.Files;

public class Main {
	
	public static void main(String[] args) {
		
		Person p2 = new Person("john smith", "Software Developer", 26);
		Person p1 = new Person("Bane", "Software tester", 32);
		Person p3 = new Person("the Joker", "consultant", 26);
		Person p4 = new Person("the shafeeq", "supepr hero", 29);
		Person p5 = new Person("hulk", "smash", 22);
		
		Person.getPersonList().add(p1);
		Person.getPersonList().add(p2);
		Person.getPersonList().add(p3);
		Person.getPersonList().add(p4);
		Person.getPersonList().add(p5);
		
		Person.addToFile();	
		
		
	}
	
}
