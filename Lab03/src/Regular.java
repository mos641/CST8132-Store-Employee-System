// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 3
// Description: Class for creating Regular, a type of employee and extension of the Employee class

import java.util.Scanner;

public class Regular extends Employee {
	private double salary;
	
	//no argument constructor
	public Regular() {
		
	}

	/* not needed
	// parameterized constructor to set properties
	public Regular(double salary, int employeeNumber, String firstName, String lastName, String emailId,
			long phoneNumber) {
		super(employeeNumber, firstName, lastName, emailId, phoneNumber);
		this.salary = salary;
	}
	*/

	//method to use the Employee readEmployee and add the Regular specific variables
	@Override
	public void readEmployee() {
		Scanner input = new Scanner(System.in);
		
		// call the readEmployee from super method for the Employee information
		super.readEmployee();
		
		// ask for and store the Regular specific information
		System.out.print("Enter annual salary: ");
		salary = (input.nextDouble()/12);
	}

	//method to use the Employee printEmployee and add the Regular specific variables
	@Override
	public void printEmployee() {
		
		// call the super method to print the details of the employee
		super.printEmployee();
		
		//print out the Regular specific information
		System.out.printf("%5s%.2f%2s", " ", salary, " |\n");
	}

}
