// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 3
// Description: Class for creating Person to use as super class for employee

import java.util.Scanner;

public class Person {
	// instance variables
	protected String firstName;
	protected String lastName;
	protected String emailId;
	protected long phoneNumber;
	
	//no argument constructor
	public Person() {
		
	}
		
	// parameterized constructor to set properties
	public Person(String firstName, String lastName, String emailId, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	// getter method for name
	public String getName() {
		String Name = firstName + " " + lastName;
		return Name;
	}

	// getter method for email
	public String getEmail() {
		return emailId;
	}

	// getter method for phone number
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void readPersonalDetails() {
		//scanner to read input
		Scanner input = new Scanner(System.in);

		// ask for information and store in variables
		System.out.print("Enter first name: ");
		firstName = input.next();

		System.out.print("Enter last name: ");
		lastName = input.next();

		System.out.print("Enter email Id: ");
		emailId = input.next();

		System.out.print("Enter phone number: ");
		phoneNumber = input.nextLong();
	}

}
