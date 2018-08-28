package co.hw.Files;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Person {
	private  String name; 
	private String occupation;
	private int age;
	
	private static ArrayList<Person> personList = new ArrayList<Person>();
	
	public Person(String name, String occupation, int age) {
		this.name = name; 
		this.occupation = occupation; 
		this.age = age ; 
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static ArrayList<Person> getPersonList() {
		return personList;
	}

	public static void setPersonList(ArrayList<Person> personList) {
		Person.personList = personList;
	} 
		
	
	@Override
	public String toString() {
		return "\n  " + name + "," + occupation + ","+ age;
	}

	public static void addToFile() {
		String filePath = "C:/test.txt";
		String contentToAppend = "";	
		
		for (Person person : personList) {
			contentToAppend = person.toString();
			try (Writer fileWriter = new FileWriter(filePath, true)){
				fileWriter.write(contentToAppend);
			} catch (IOException e) {
				System.out.println("Problem occurs when deleting the directory : " + filePath);
				e.printStackTrace();
			}
			
		}
		// TODO Auto-generated method stub

	}
	
	
	
	

}
