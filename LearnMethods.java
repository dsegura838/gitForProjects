package tutorial;

import java.util.ArrayList;

public class LearnMethods {
	
	public static int returnAnInt(float a) {
		return (int) a;
	}
	public static int returnAnInt(double a) {
		return (int) a;
	}
	
	public static void main(String[] args) {
		double myDouble = 5.0;
		float myFloat = 4.0f;
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Mary", "Smith"));
		
		for (Person thisPerson : people) {
			System.out.println(thisPerson.firstName);
		}
		System.out.println(returnAnInt(myDouble));
		System.out.println(returnAnInt(myDouble));
	}


}

