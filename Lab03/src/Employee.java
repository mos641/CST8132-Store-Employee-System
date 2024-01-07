// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 3
// Description: Class for creating Employee as an extension of Person and to use as super class for regular and contractor

import java.util.Scanner;

public class Employee extends Person {
	protected int employeeNumber;
	protected Person emp;
	
	//no argument constructor
	public Employee() {
		
	}
		
	// parameterized constructor to set properties
	public Employee(int employeeNumber, String firstName, String lastName, String emailId, long phoneNumber){
		super(firstName, lastName, emailId, phoneNumber);
		this.employeeNumber = employeeNumber;
	}
	
	public void readEmployee() {
		Scanner input = new Scanner(System.in);
		//ask for and store information
		System.out.print("Enter employee number: ");
		employeeNumber = input.nextInt();
		
		//call the Person readPersonalDetails method for the rest of the information
		super.readPersonalDetails();
	}
	
	public void printEmployee() {
		//print the details of the employee
		System.out.printf("%15s%25s%20s%15s", 
				employeeNumber + " |", 
				super.getName() + " |", 
				emailId + " |", 
				phoneNumber + " |");
	}
}
