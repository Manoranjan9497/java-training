package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	
	void eat() {
		System.out.println(email);
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7978620525";
		
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		
		Person person2 = new Person();
		person2.name = "Hari";
		person2.sleep(); 
		
		/*
		//Person-
		
		// Attributes, Variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7978620525";
		
        // Action, activity,behavoiur
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//what is we wanted to do for another person?
		String name2 = "Mano";
		String email2 = "mano@testemail.com";
		String phone2 = "9439580511";
		
        // Action, activity,behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2+ " is eating");
		
		//	what about binding attributes and properties together	
	}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is waliking ");
	
	*/			
	}
	

}


