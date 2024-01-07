// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 3
//Description: Class for creating Contractor, a type of employee and extension of the Employee class

import java.util.Scanner;

public class Contractor extends Employee {
	private double hourlyRate;
	private double numHours;
	
	//no argument constructor
	public Contractor() {
		
	}

	/* not needed
	// parameterized constructor to set properties
	public Contractor(double hourlyRate, double numHours, int employeeNumber, String firstName, String lastName, String emailId, long phoneNumber) {
		super(employeeNumber, firstName, lastName, emailId, phoneNumber);
		this.hourlyRate = hourlyRate;
		this.numHours = numHours;
	}
	*/
	
	//method to use the Employee readEmployee and add the Contractor specific variables
	@Override
	public void readEmployee() {
		Scanner input = new Scanner(System.in);
		
		// call the readEmployee from super method for the Employee information
		super.readEmployee();
		
		// ask for and store the Contractor specific information
		System.out.print("Enter hourly rate: ");
		hourlyRate = input.nextDouble();
		
		System.out.print("Enter number of hours worked: ");
		numHours = input.nextDouble();
	}
	
	//method to use the Employee printEmployee and add the Contractor specific variables
	@Override
	public void printEmployee() {
		
		// call the super method to print the details of the employee
		super.printEmployee();
		
		//print out the Contractor specific information
		System.out.printf("%5s%.2f%2s", " ", (hourlyRate * numHours), " |\n");
	}

}
